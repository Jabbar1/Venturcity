package com.shaik.rest;

import com.shaik.model.Rider;
import com.shaik.rest.ride.BaseRideResource;
import com.shaik.service.operations.ride.RideOperations;
import com.shaik.service.operations.ride.RiderOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jabbars on 2/26/2017.
 */
@RestController("RiderRideViewResource")
@RequestMapping(value = "v1/api/rider/ride")
public class RiderResource extends BaseRideResource<Rider,UUID> {


    RiderOperations riderOperations;

    @Inject
    public RiderResource(RiderOperations riderOperations) {
        super(riderOperations);
        this.riderOperations = riderOperations;
    }
}
