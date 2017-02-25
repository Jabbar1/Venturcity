package com.shaik.service.operations;

import com.shaik.model.Invoice;

/**
 * This Interface Provides all Information regarding Rides
 * This Operations are common for a Rider and CabDriver
 *
 *
 * Created by jabbars on 2/25/2017.
 */
public interface RideOperations<M, ID> {

    Integer completed();
    Integer cancelled();
    Integer total();
    Boolean cancel();
    Boolean finish();
    Boolean changeDirection();
    Invoice invoice();
    M view();
}
