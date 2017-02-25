package com.shaik.service.impl.crud;

import com.shaik.domain.entity.ERider;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.domain.repository.RiderRepository;
import com.shaik.mapper.RiderMapper;
import com.shaik.model.Rider;
import com.shaik.service.impl.BaseEntityValidator;
import com.shaik.service.operations.crud.RiderCrudOperations;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by jabbars on 2/26/2017.
 */
@Named("RiderCrudTemplate")
public class RiderCrudTemplate extends BaseCrudTemplate<Rider,ERider,UUID> implements RiderCrudOperations{

    RiderRepository riderRepository;

    @Inject
    public RiderCrudTemplate(BaseEntityValidator<Rider> baseEntityValidator,
                             RiderRepository riderRepository) {
        super(riderRepository, RiderMapper.entity, RiderMapper.model, RiderMapper.update, baseEntityValidator);
        this.riderRepository = riderRepository;
    }
}
