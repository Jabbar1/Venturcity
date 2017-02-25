package com.shaik.rest.crud;

import com.shaik.model.Rider;
import com.shaik.rest.ride.BaseRideResource;
import com.shaik.service.operations.crud.RiderCrudOperations;
import com.shaik.service.operations.ride.RideOperations;
import com.shaik.service.operations.ride.RiderOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.UUID;

/**
 * Created by jabbars on 2/26/2017.
 */
@RestController("RiderCrudResource")
@RequestMapping(value = "v1/api/rider")
public class RiderCrudResource extends BaseResource<Rider,UUID> {


   RiderCrudOperations riderCrudOperations;

    public RiderCrudResource(RiderCrudOperations riderCrudOperations) {
        super(riderCrudOperations);
        this.riderCrudOperations = riderCrudOperations;
    }
}
