package com.shaik.service.impl;

import com.shaik.domain.entity.EOwner;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.model.Invoice;
import com.shaik.model.Owner;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by jabbars on 2/25/2017.
 */
public class OwnerTemplate extends CabTemplate<Owner,EOwner,Long> {



    public OwnerTemplate(BaseRepository<EOwner, Long> baseRepository,
                         Function<EOwner, Owner> modelMapper,
                         Function<Owner, EOwner> entityMapper,
                         BiFunction<Owner, EOwner, EOwner> updateMapper,
                         BaseEntityValidator<Owner> baseEntityValidator) {
        super(baseRepository, modelMapper, entityMapper, updateMapper, baseEntityValidator);
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
