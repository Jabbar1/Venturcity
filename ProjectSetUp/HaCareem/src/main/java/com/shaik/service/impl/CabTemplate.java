package com.shaik.service.impl;

import com.shaik.domain.entity.ECab;
import com.shaik.domain.entity.EUser;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.model.Cab;
import com.shaik.model.TrackDetails;
import com.shaik.service.operations.CabOperations;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by jabbars on 2/25/2017.
 */
public abstract class CabTemplate<C extends Cab,E extends EUser,ID extends Serializable>
        extends RideTemplate<C,E,ID> implements CabOperations<C,ID> {


    public CabTemplate(BaseRepository<E, ID> baseRepository,
                       Function<E, C> modelMapper,
                       Function<C, E> entityMapper,
                       BiFunction<C, E, E> updateMapper,
                       BaseEntityValidator<C> baseEntityValidator) {
        super(baseRepository, modelMapper, entityMapper, updateMapper, baseEntityValidator);
    }

    @Override
    public TrackDetails track() {
        return null;
    }

    @Override
    public TrackDetails distanceCovered() {
        return null;
    }

    @Override
    public Double totalAmountEarned(ZonedDateTime from, ZonedDateTime to) {
        return null;
    }

    @Override
    public Long noOfRides(ZonedDateTime from, ZonedDateTime to) {
        return null;
    }

    @Override
    public Boolean stopService(ZonedDateTime from, ZonedDateTime to) {
        return null;
    }
}
