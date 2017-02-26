package com.shaik.rest.ride;

import com.shaik.model.CabRequest;
import com.shaik.model.Captain;
import com.shaik.model.TrackDetails;
import com.shaik.service.operations.ride.CaptainOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

/**
 * Created by jabbars on 2/26/2017.
 */
@RestController("CaptainRideViewResource")
@RequestMapping(value = "v1/api/captain/ride")
public class CaptainResource extends CabResource<Captain, UUID> {

    CaptainOperations captainOperations;

    @Inject
    public CaptainResource(CaptainOperations captainOperations) {
        super(captainOperations);
        this.captainOperations = captainOperations;
    }

    @RequestMapping(
            value = "/{id}/send/location",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void sendData(@PathVariable("id") String id,
                         @RequestBody TrackDetails details) {
        captainOperations.sendData(UUID.fromString(id), details);
    }

    /**
     * Captain Accepts a incoming ride Request.
     * To Reject we have cancel Method
     *
     * @param id
     */
    @RequestMapping(
            value = "/{id}/accept",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void acceptRide(@PathVariable("id") String id) {
        captainOperations.acceptRide(UUID.fromString(id));
    }

}
