package com.shaik.service.impl;

import com.shaik.domain.entity.EOwner;
import com.shaik.domain.repository.OwnerRepository;
import com.shaik.mapper.OwnerMapper;
import com.shaik.model.Invoice;
import com.shaik.model.Owner;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
@Named("hcOwnerTemplate")
public class OwnerTemplate extends CabTemplate<Owner,EOwner,UUID> {

    private OwnerRepository ownerRepository;

    @Inject
    public OwnerTemplate(OwnerRepository ownerRepository,
                         BaseEntityValidator<Owner> baseEntityValidator) {
        super(ownerRepository, OwnerMapper.entity, OwnerMapper.model, OwnerMapper.update, baseEntityValidator);
        this.ownerRepository = ownerRepository;
    }


    /**
     * Through Not Supported Operation
     *
     * @return
     */
    @Override
    public Integer completed() {
        return super.completed();
    }

    @Override
    public Integer cancelled() {
        return super.cancelled();
    }

    @Override
    public Integer total() {
        return super.total();
    }

    @Override
    public Boolean cancel() {
        return super.cancel();
    }

    @Override
    public Boolean finish() {
        return super.finish();
    }

    @Override
    public Boolean changeDirection() {
        return super.changeDirection();
    }

    @Override
    public Invoice invoice() {
        return super.invoice();
    }

    @Override
    public Owner view() {
        return super.view();
    }
}
