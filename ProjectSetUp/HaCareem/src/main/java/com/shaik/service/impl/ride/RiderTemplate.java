package com.shaik.service.impl.ride;

import com.shaik.domain.entity.ERider;
import com.shaik.domain.repository.RiderRepository;
import com.shaik.model.CabRequest;
import com.shaik.model.Rider;
import com.shaik.service.operations.ride.RiderOperations;

import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
@Named("hcRiderTemplate")
public class RiderTemplate extends RideTemplate<Rider,ERider,UUID> implements RiderOperations {


    private RiderRepository riderRepository;

    public RiderTemplate(RiderRepository riderRepository) {
        super(riderRepository);
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
