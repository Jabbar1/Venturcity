package com.shaik.rest.ride;

import com.shaik.model.Cab;
import com.shaik.service.operations.ride.CabOperations;

import java.io.Serializable;

/**
 * Created by jabbars on 2/26/2017.
 */
public class CabResource<C extends Cab,ID extends Serializable> extends BaseRideResource<C,ID> {

    private CabOperations<C,ID> cabOperations;

    public CabResource(CabOperations<C, ID> cabOperations) {
        super(cabOperations);
        this.cabOperations = cabOperations;
    }
}
