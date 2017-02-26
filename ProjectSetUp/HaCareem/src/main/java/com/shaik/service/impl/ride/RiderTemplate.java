package com.shaik.service.impl.ride;

import com.shaik.domain.entity.ERider;
import com.shaik.domain.repository.RiderRepository;
import com.shaik.model.CabRequest;
import com.shaik.model.Rider;
import com.shaik.service.operations.ride.RiderOperations;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
@Named("hcRiderTemplate")
public class RiderTemplate extends RideTemplate<Rider, ERider, UUID> implements RiderOperations {


    private RiderRepository riderRepository;

    public RiderTemplate(RiderRepository riderRepository) {
        super(riderRepository);
        this.riderRepository = riderRepository;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Boolean request(UUID userId, CabRequest request) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Boolean requestLater(UUID userId, CabRequest request) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Boolean planRide(UUID userId, CabRequest request) {
        return null;
    }
}
