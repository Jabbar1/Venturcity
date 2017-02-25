package com.shaik.service.impl;

import com.shaik.domain.entity.ERider;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.model.CabRequest;
import com.shaik.model.Rider;
import com.shaik.service.operations.RiderOperations;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by jabbars on 2/25/2017.
 */
public class RiderTemplate extends RideTemplate<Rider,ERider,Long> implements RiderOperations {

    public RiderTemplate(BaseRepository<ERider, Long> baseRepository,
                         Function<ERider, Rider> modelMapper,
                         Function<Rider, ERider> entityMapper,
                         BiFunction<Rider, ERider, ERider> updateMapper,
                         BaseEntityValidator<Rider> baseEntityValidator) {
        super(baseRepository, modelMapper, entityMapper, updateMapper, baseEntityValidator);
    }

    @Override
    public Boolean request(Long userId, CabRequest request) {
        return null;
    }
}
