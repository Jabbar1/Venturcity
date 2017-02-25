package com.shaik.service.operations.ride;

import com.shaik.model.CabRequest;
import com.shaik.model.Rider;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
public interface RiderOperations extends RideOperations<Rider,UUID>{

    Boolean request(Long userId, CabRequest request);
    Boolean requestLater(Long userId, CabRequest request);
    Boolean planRide(Long userId, CabRequest request);
}
