package com.shaik.service.impl.ride;

import com.shaik.domain.entity.ERider;
import com.shaik.domain.repository.RiderRepository;
import com.shaik.model.CabRequest;
import com.shaik.model.Captain;
import com.shaik.model.Rider;
import com.shaik.service.operations.crud.CaptainCrudOperations;
import com.shaik.service.operations.ride.RiderOperations;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
@Named("hcRiderTemplate")
public class RiderTemplate extends RideTemplate<Rider, ERider, UUID> implements RiderOperations {


    private CaptainCrudOperations captainOperations;
    private RiderRepository riderRepository;

    @Inject
    public RiderTemplate(CaptainCrudOperations captainOperations, RiderRepository riderRepository) {
        super(riderRepository);
        this.captainOperations = captainOperations;
        this.riderRepository = riderRepository;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Captain request(UUID userId, CabRequest request) {
        // 1. Need to Get Data From cloud,
        googleOperations.searchPlace();     // Currently using Google search API
        // 2. Filter Cabs which are available for RIDE and of Type Requested by USER
        // 3. Calculate Shortest PATH and TIME, considering SPEED, DIRECTION and TRAFFIC
        // 4. SORT the result according PATH DISTANCE and TIME
        // 5. SEND Requests to Cabs in a Sequence
        // 6. SEND Cab details to the User who accepted Ride

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Captain request(UUID userId, UUID cabId, CabRequest request) {
        // When we show User to select From Cabs
        // We can Just send the CAB details of selected CAB
        // As we are Showing Details which are Available
        Captain captain = captainOperations.find(cabId);
        return captain;
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
