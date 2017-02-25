package com.shaik.service.operations;

import com.shaik.model.CabRequest;
import com.shaik.model.Rider;

import java.io.Serializable;

/**
 * Created by jabbars on 2/25/2017.
 */
public interface RiderOperations{

    Boolean request(Long userId, CabRequest request);
}
