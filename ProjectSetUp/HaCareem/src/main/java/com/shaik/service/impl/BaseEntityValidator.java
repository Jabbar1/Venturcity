package com.shaik.service.impl;

import com.shaik.service.operations.EntityValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * Created by jabbars on 2/23/2017.
 */

public class BaseEntityValidator<T> implements EntityValidator<T> {

    protected final Validator validator;

    public BaseEntityValidator(Validator validator) {
        this.validator = validator;
    }

    public Set<ConstraintViolation<T>> validate(T t) {
        return validator.validate(t);
    }
}