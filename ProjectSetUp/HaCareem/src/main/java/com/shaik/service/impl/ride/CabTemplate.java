package com.shaik.service.impl.ride;

import com.shaik.domain.entity.EUser;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.model.Cab;
import com.shaik.model.TrackDetails;
import com.shaik.service.operations.ride.CabOperations;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * Created by jabbars on 2/25/2017.
 */
public abstract class CabTemplate<C extends Cab,E extends EUser,ID extends Serializable>
        extends RideTemplate<C,E,ID> implements CabOperations<C,ID> {

    public CabTemplate(BaseRepository<E, ID> baseRepositorys) {
        super(baseRepositorys);
    }

    @Override
    public TrackDetails track(ID cabID) {
        return null;
    }

    @Override
    public TrackDetails distanceCovered(ID cabID) {
        return null;
    }

    @Override
    public Double totalAmountEarned(ID cabID,ZonedDateTime from, ZonedDateTime to) {
        return null;
    }

    @Override
    public Long noOfRides(ID cabID,ZonedDateTime from, ZonedDateTime to) {
        return null;
    }

    @Override
    public Boolean stopService(ID cabID,ZonedDateTime from, ZonedDateTime to) {
        return null;
    }

    @Override
    public Boolean resumeService(ID cabID,ZonedDateTime from, ZonedDateTime to) {
        return null;
    }
}
