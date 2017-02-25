package com.shaik.service.operations.ride;

import com.shaik.model.Captain;

import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
public interface CaptainOperations extends CabOperations<Captain,UUID>{

    void sendData();
    void acceptRide();
}
