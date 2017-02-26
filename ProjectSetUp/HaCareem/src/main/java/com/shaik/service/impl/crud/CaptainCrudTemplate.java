package com.shaik.service.impl.crud;

import com.shaik.domain.entity.ECaptain;
import com.shaik.domain.repository.CaptainRepository;
import com.shaik.mapper.CaptainMapper;
import com.shaik.model.Captain;
import com.shaik.service.impl.BaseEntityValidator;
import com.shaik.service.operations.crud.CaptainCrudOperations;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jabbars on 2/26/2017.
 */
@Named("CaptainCrudTemplate")
public class CaptainCrudTemplate extends BaseCrudTemplate<Captain,ECaptain,UUID> implements CaptainCrudOperations{

    CaptainRepository captainRepository;

    @Inject
    public CaptainCrudTemplate(BaseEntityValidator<Captain> baseEntityValidator,
                               CaptainRepository captainRepository) {
        super(captainRepository, CaptainMapper.entity,  CaptainMapper.model,  CaptainMapper.update, baseEntityValidator);
        this.captainRepository = captainRepository;
    }

}
