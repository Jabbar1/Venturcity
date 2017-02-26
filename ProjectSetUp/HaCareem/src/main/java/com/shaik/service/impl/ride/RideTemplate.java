package com.shaik.service.impl.ride;

import com.shaik.domain.entity.EUser;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.integration.google.GoogleOperations;
import com.shaik.model.*;
import com.shaik.service.operations.ride.RideOperations;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
public abstract class RideTemplate<R extends User, E extends EUser, ID extends Serializable>
        implements RideOperations<R, ID> {

    protected BaseRepository<E, ID> baseRepository;

    /**
     * Currently Injecting Google Search,
     * We can Inject even more Services here and all Services defined here will be
     * available for all Child classes
     *
     */
    @Inject
    protected GoogleOperations googleOperations;

    public RideTemplate(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Integer completed() {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Integer cancelled() {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Integer total() {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Boolean cancel(Reason Reason) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Boolean finish() {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Boolean changeDirection(Directions directions) {
        return null;
    }

    @Override
    public Invoice invoice(ID rideId) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<R> view(CabRequest request) {
        return null;
    }
}
