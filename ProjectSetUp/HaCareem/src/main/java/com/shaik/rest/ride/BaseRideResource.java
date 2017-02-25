package com.shaik.rest.ride;

import com.shaik.model.User;
import com.shaik.service.operations.ride.RideOperations;

import java.io.Serializable;

/**
 * Created by jabbars on 2/26/2017.
 */
public abstract class BaseRideResource<M extends User, ID extends Serializable>{

    RideOperations<M,ID> rideOperations;


    public BaseRideResource(RideOperations<M, ID> rideOperations) {
        this.rideOperations = rideOperations;
    }


}
