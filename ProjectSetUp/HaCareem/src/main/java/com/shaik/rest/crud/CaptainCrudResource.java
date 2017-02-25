package com.shaik.rest.crud;

import com.shaik.model.Captain;
import com.shaik.rest.ride.CabResource;
import com.shaik.service.operations.crud.BaseCrudOperations;
import com.shaik.service.operations.crud.CaptainCrudOperations;
import com.shaik.service.operations.ride.CaptainOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.UUID;

/**
 * Created by jabbars on 2/26/2017.
 */
@RestController("CaptainCrudResource")
@RequestMapping(value = "v1/api/captain")
public class CaptainCrudResource extends BaseResource<Captain,UUID> {

    CaptainCrudOperations captainOperations;


    @Inject
    public CaptainCrudResource(CaptainCrudOperations captainOperations) {
        super(captainOperations);
        this.captainOperations = captainOperations;
    }
}
