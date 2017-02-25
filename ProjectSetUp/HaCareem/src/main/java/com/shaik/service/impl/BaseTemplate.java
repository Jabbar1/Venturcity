package com.shaik.service.impl;

import com.shaik.domain.repository.BaseRepository;
import com.shaik.exception.BaseException;
import com.shaik.exception.ConstraintValidationException;
import com.shaik.exception.InvalidInputException;
import com.shaik.exception.NotFoundException;
import com.shaik.model.FileDetails;
import com.shaik.service.operations.BaseOperations;
import com.shaik.service.operations.EntityValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.constraints.NotNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Common Operations are performed in this class
 * <p>
 * Created by jabbars on 1/31/2017.
 */
@Validated
public abstract class BaseTemplate<M, E, ID extends Serializable> implements BaseOperations<M, ID> {

    Logger LOGGER = LoggerFactory.getLogger(BaseTemplate.class);

    protected BaseRepository<E, ID> baseRepository;
    protected Function<E, M> modelMapper;
    protected Function<M, E> entityMapper;
    protected BiFunction<M, E, E> updateMapper;

    public BaseTemplate(BaseRepository<E, ID> baseRepository,
                        Function<E, M> modelMapper,
                        Function<M, E> entityMapper,
                        BiFunction<M, E, E> updateMapper) {
        this.baseRepository = baseRepository;
        this.modelMapper = modelMapper;
        this.entityMapper = entityMapper;
        this.updateMapper = updateMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public M create(@Valid M request) {
        E entity = entityMapper.apply(request);
        entity = baseRepository.save(entity);
        return modelMapper.apply(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public M update(@NotNull ID id, @Valid M request) {
        E entity = findOne(id);
        entity = updateMapper.apply(request, entity);
        entity = baseRepository.save(entity);
        return modelMapper.apply(entity);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<M> findAll() {
        List<E> result = baseRepository.findAll();
        return result.stream().map(modelMapper)
                .collect(Collectors.toList());
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public M find(@NotNull ID id) {
        E entity = findOne(id);
        return modelMapper.apply(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void delete(@NotNull ID id) {
        findOne(id);
        baseRepository.delete(id);
    }

    /**
     * Override these methods with required implementation
     * else
     * Override throwing Exception with status NotImplemented
     */
    abstract Set<E> extractDataFromFile(BufferedReader br) throws IOException;

    abstract List<E> validateAndReadData(FileDetails file) throws IOException;

    protected E findOne(ID id) {
        E entity = baseRepository.findOne(id);
        if (ObjectUtils.isEmpty(entity)) {
            throw new NotFoundException("Given Fraction for a Profile Not exist with ID " + id + ", Please Provide Valid data");
        }
        return entity;
    }

    protected void isFileValid(String file) {
        if (!file.endsWith(".csv")) {
            throw new InvalidInputException("Only \".csv\" files can be Imported");
        }
    }

    /**
     * Validate all Properties of a Class
     *
     * @param model
     */
    protected void validate(M model) {

        EntityValidator<M> validator = new BaseEntityValidator<>(Validation.buildDefaultValidatorFactory().getValidator());
        Set<ConstraintViolation<M>> messages = validator.validate(model);
        List<String> validationException = new ArrayList<>();
        if (!messages.isEmpty()) {
            for (ConstraintViolation<M> message : messages) {
                StringBuilder messageBuilder = new StringBuilder("");
                validationException.add(
                        messageBuilder.append("\n")
                                .append("Property : ").append(message.getPropertyPath().toString()).append(",   ")
                                .append("Message : ").append(message.getMessage()).append(",    ")
                                .append("Bean : ").append(message.getRootBean().getClass().getName()).toString());
            }
            throw new ConstraintValidationException(validationException.toString());
        }
    }
}
