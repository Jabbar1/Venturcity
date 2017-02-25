package com.shaik.service.operations;

import javax.validation.ConstraintViolation;
import java.util.Set;

/**
 * Created by jabbars on 2/23/2017.
 */
public interface EntityValidator<T> {

    //Set<ConstraintViolation<T>> validate(T t);

   Set<ConstraintViolation<T>> validate(T t);
}
