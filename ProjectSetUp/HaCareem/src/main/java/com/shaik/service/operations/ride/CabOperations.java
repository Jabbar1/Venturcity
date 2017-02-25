package com.shaik.service.operations.ride;

import com.shaik.model.Cab;
import com.shaik.model.TrackDetails;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * Created by jabbars on 2/25/2017.
 */
public interface CabOperations<C extends Cab, ID extends Serializable> extends RideOperations<C,ID> {

    TrackDetails track();
    TrackDetails distanceCovered();
    Double totalAmountEarned(ZonedDateTime from, ZonedDateTime to);
    Long noOfRides(ZonedDateTime from, ZonedDateTime to);
    Boolean stopService(ZonedDateTime from, ZonedDateTime to);
    Boolean resumeService(ZonedDateTime from, ZonedDateTime to);


}
