package com.shaik.rest.ride;

import com.shaik.model.Captain;
import com.shaik.service.operations.ride.CaptainOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.UUID;

/**
 * Created by jabbars on 2/26/2017.
 */
@RestController("CaptainRideViewResource")
@RequestMapping(value = "v1/api/captain/ride")
public class CaptainResource extends CabResource<Captain,UUID> {

    CaptainOperations captainOperations;

    @Inject
    public CaptainResource(CaptainOperations captainOperations) {
        super(captainOperations);
        this.captainOperations = captainOperations;
    }
}
