package com.shaik.rest.ride;

import com.shaik.model.Cab;
import com.shaik.model.CabRequest;
import com.shaik.model.TrackDetails;
import com.shaik.service.operations.ride.CabOperations;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This a Resource Handles Requests from Captain and Owner
 * <p>
 * Created by jabbars on 2/26/2017.
 */
public class CabResource<C extends Cab, ID extends Serializable> extends BaseRideResource<C, ID> {

    private CabOperations<C, ID> cabOperations;

    public CabResource(CabOperations<C, ID> cabOperations) {
        super(cabOperations);
        this.cabOperations = cabOperations;
    }

    /**
     * Gives Live Tracking Information of a Cab
     *
     * @param cabId for a given cabID
     * @return Tracking Details
     */
    @RequestMapping(
            value = "/{cabId}/track",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public TrackDetails viewTrackingDetailsOfCab(@PathVariable(value = "cabId") ID cabId) {
        return cabOperations.track(cabId);
    }

    /**
     * Distance covered By Cab
     *
     * @param cabId
     * @return
     */
    @RequestMapping(
            value = "/{cabId}/distance",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public TrackDetails distanceCovered(@PathVariable(value = "cabId") ID cabId) {
        return cabOperations.distanceCovered(cabId);
    }


    @RequestMapping(
            value = "/{cabId}/distance",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public Long noOfRides(@PathVariable(value = "cabId") ID cabId,
                          @RequestParam(value = "startTime", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime startTime,
                          @RequestParam(value = "endTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime endTime) {
        return cabOperations.noOfRides(cabId, startTime, endTime);
    }

    @RequestMapping(
            value = "/{cabId}/stop/service",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void StopService(@PathVariable(value = "cabId") ID cabId,
                            @RequestParam(value = "startTime", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime startTime,
                            @RequestParam(value = "endTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime endTime) {
        cabOperations.stopService(cabId, startTime, endTime);
    }

    @RequestMapping(
            value = "/{cabId}/resume/service",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void resumeService(@PathVariable(value = "cabId") ID cabId,
                              @RequestParam(value = "startTime", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime startTime,
                              @RequestParam(value = "endTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime endTime) {
        cabOperations.resumeService(cabId, startTime, endTime);
    }
    @RequestMapping(
            value = "/{cabId}/amount",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void moneyEarned(@PathVariable(value = "cabId") ID cabId,
                              @RequestParam(value = "startTime", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime startTime,
                              @RequestParam(value = "endTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) ZonedDateTime endTime) {
        cabOperations.totalAmountEarned(cabId, startTime, endTime);
    }
}
