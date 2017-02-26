package com.shaik.service.operations.ride;

import com.shaik.model.CabRequest;
import com.shaik.model.Rider;

import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
public interface RiderOperations extends RideOperations<Rider, UUID> {

    Boolean request(UUID userId, CabRequest request);

    Boolean requestLater(UUID userId, CabRequest request);

    Boolean planRide(UUID userId, CabRequest request);
}
