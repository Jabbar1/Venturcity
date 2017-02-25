package com.shaik.service.impl.ride;

import com.shaik.domain.entity.EUser;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.integration.google.GoogleOperations;
import com.shaik.model.Invoice;
import com.shaik.model.User;
import com.shaik.service.operations.ride.RideOperations;

import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by jabbars on 2/25/2017.
 */
public abstract class RideTemplate<R extends User,E extends EUser,ID extends Serializable>
        implements RideOperations<R,ID>{

    BaseRepository<E,ID> baseRepository;

    @Inject
    GoogleOperations googleOperations;

    public RideTemplate(BaseRepository<E, ID> baseRepositorys) {
        this.baseRepository = baseRepository;
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
