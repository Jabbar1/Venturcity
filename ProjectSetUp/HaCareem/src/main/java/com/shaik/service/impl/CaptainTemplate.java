package com.shaik.service.impl;

import com.shaik.domain.entity.ECaptain;
import com.shaik.domain.repository.CaptainRepository;
import com.shaik.mapper.CaptainMapper;
import com.shaik.model.Captain;
import com.shaik.service.operations.CaptainOperations;

import javax.inject.Named;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by jabbars on 2/25/2017.
 */
@Named("CaptainTemplate")
public class CaptainTemplate extends CabTemplate<Captain,ECaptain,UUID> implements CaptainOperations{

    private CaptainRepository captainRepository;

    public CaptainTemplate(CaptainRepository captainRepository,
                           BaseEntityValidator<Captain> baseEntityValidator) {

        super(captainRepository, CaptainMapper.entity, CaptainMapper.model, CaptainMapper.update, baseEntityValidator);
        this.captainRepository = captainRepository;
    }

    @Override
    public void sendData() {

    }

    @Override
    public void acceptRide() {

    }
}
