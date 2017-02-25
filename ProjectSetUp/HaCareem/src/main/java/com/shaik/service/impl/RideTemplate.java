package com.shaik.service.impl;

import com.shaik.domain.entity.EUser;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.model.Invoice;
import com.shaik.model.User;
import com.shaik.service.operations.RideOperations;

import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by jabbars on 2/25/2017.
 */
public abstract class RideTemplate<R extends User,E extends EUser,ID extends Serializable>
        extends BaseCrudTemplate<R,E,ID>  implements RideOperations<R,ID>{

    public RideTemplate(BaseRepository<E, ID> baseRepository,
                        Function<E, R> modelMapper,
                        Function<R, E> entityMapper,
                        BiFunction<R, E, E> updateMapper,
                        BaseEntityValidator<R> baseEntityValidator) {
        super(baseRepository, modelMapper, entityMapper, updateMapper, baseEntityValidator);
    }

    @Override
    public Integer completed() {
        return null;
    }

    @Override
    public Integer cancelled() {
        return null;
    }

    @Override
    public Integer total() {
        return null;
    }

    @Override
    public Boolean cancel() {
        return null;
    }

    @Override
    public Boolean finish() {
        return null;
    }

    @Override
    public Boolean changeDirection() {
        return null;
    }

    @Override
    public Invoice invoice() {
        return null;
    }

    @Override
    public R view() {
        return null;
    }
}
