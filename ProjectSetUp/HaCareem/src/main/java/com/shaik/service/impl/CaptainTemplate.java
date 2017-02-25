package com.shaik.service.impl;

import com.shaik.domain.entity.ECaptain;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.model.Cab;
import com.shaik.model.Captain;
import com.shaik.service.operations.CabOperations;
import com.shaik.service.operations.CaptainOperations;
import com.shaik.service.operations.RideOperations;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by jabbars on 2/25/2017.
 */
public class CaptainTemplate extends CabTemplate<Captain,ECaptain,Long> implements CaptainOperations{

    public CaptainTemplate(BaseRepository<ECaptain, Long> baseRepository,
                           Function<ECaptain, Captain> modelMapper,
                           Function<Captain, ECaptain> entityMapper,
                           BiFunction<Captain, ECaptain, ECaptain> updateMapper,
                           BaseEntityValidator<Captain> baseEntityValidator) {

        super(baseRepository, modelMapper, entityMapper, updateMapper, baseEntityValidator);
    }

    @Override
    public void sendData() {

    }

    @Override
    public void acceptRide() {

    }
}
