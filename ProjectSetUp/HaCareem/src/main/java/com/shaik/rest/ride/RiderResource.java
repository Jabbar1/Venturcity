package com.shaik.rest.ride;

import com.shaik.model.CabRequest;
import com.shaik.model.Rider;
import com.shaik.rest.ride.BaseRideResource;
import com.shaik.service.operations.ride.RiderOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.UUID;

/**
 * Created by jabbars on 2/26/2017.
 */
@RestController("RiderRideViewResource")
@RequestMapping(value = "v1/api/rider/ride")
public class RiderResource extends BaseRideResource<Rider,UUID> {


    RiderOperations riderOperations;

    @Inject
    public RiderResource(RiderOperations riderOperations) {
        super(riderOperations);
        this.riderOperations = riderOperations;
    }

    /**
     * Places a request for a New Cab
     *
     * @param id
     * @param request
     */
    @RequestMapping(
            value = "/{id}/request",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void bookACab(@PathVariable("id") String id,
                                     @RequestBody CabRequest request) {
        riderOperations.request(UUID.fromString(id), request);
    }


    /**
     * Books cab at the requested time and Place
     *
     * @param id
     * @param request
     */
    @RequestMapping(
            value = "/{id}/request/later",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void bookCabLater(@PathVariable("id") String id,
                                     @RequestBody CabRequest request) {
        riderOperations.requestLater(UUID.fromString(id), request);
    }

    /**
     * This is My Idea to Plan a Ride. The Main motivation behind this is,
     * we Have some scenarios, where we can book a Cab at the time booking some other events
     *
     * Location -> Cab -> Movies/Event -> Cab -> Location
     * Location -> Cab -> Restaurant   -> Cab -> Movies/Event -> Cab -> Location
     * Location -> Cab -> Airport-> Take Flight -> Airport -> Cab -> Location (As Careem
     *
     * Plan a Ride, we can achieve by adding Ticket booking feature(ECommerce).
     * By this Careem can fulfill all transportation needs of a Customer.
     * ***(CAB + TICKET_BOOKING[Movie,Flight,Event,Boat etc.,]) ***
     *
     * For More details read "CareemCaseStudy.pptx"
     * @param id
     * @param request
     */
    @RequestMapping(
            value = "/{id}/plan",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void planARide(@PathVariable("id") String id,
                                     @RequestBody CabRequest request) {
        riderOperations.planRide(UUID.fromString(id), request);
    }


}
