package com.shaik.service.operations.ride;

import com.shaik.model.CabRequest;
import com.shaik.model.Directions;
import com.shaik.model.Invoice;
import com.shaik.model.Reason;

import java.util.List;

/**
 * This Interface Provides all Information regarding Rides
 * This Operations are common for a Rider and CabDriver
 * <p>
 * <p>
 * Created by jabbars on 2/25/2017.
 */
public interface RideOperations<M, ID> {

    Integer completed();

    Integer cancelled();

    Integer total();

    Boolean cancel(Reason reason);

    Boolean finish();

    Boolean changeDirection(Directions directions);

    Invoice invoice(ID rideId);

    List<M> view(CabRequest request);
}
