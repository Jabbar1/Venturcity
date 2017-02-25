package com.shaik.service.impl;

import com.shaik.domain.entity.ERider;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.domain.repository.RiderRepository;
import com.shaik.mapper.OwnerMapper;
import com.shaik.mapper.RiderMapper;
import com.shaik.model.CabRequest;
import com.shaik.model.Rider;
import com.shaik.service.operations.RiderOperations;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by jabbars on 2/25/2017.
 */
@Named("hcRiderTemplate")
public class RiderTemplate extends RideTemplate<Rider,ERider,UUID> implements RiderOperations {


    private RiderRepository riderRepository;

    @Inject
    public RiderTemplate(RiderRepository riderRepository,
                         BaseEntityValidator<Rider> baseEntityValidator) {
        super(riderRepository, RiderMapper.entity, RiderMapper.model, RiderMapper.update, baseEntityValidator);
        this.riderRepository = riderRepository;
    }

    @Override
    public Boolean request(Long userId, CabRequest request) {
        return null;
    }

    @Override
    public Boolean requestLater(Long userId, CabRequest request) {
        return null;
    }

    @Override
    public Boolean planRide(Long userId, CabRequest request) {
        return null;
    }
}
