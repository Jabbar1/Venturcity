package com.shaik.rest.crud;

import com.shaik.model.Owner;
import com.shaik.rest.ride.CabResource;
import com.shaik.service.operations.crud.OwnerCrudOperation;
import com.shaik.service.operations.ride.CabOperations;
import com.shaik.service.operations.ride.OwnerOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.UUID;

/**
 * Created by jabbars on 2/26/2017.
 */
@RestController("OwnerCrudResource")
@RequestMapping(value = "v1/api/owner")
public class OwnerCrudResource extends BaseResource<Owner,UUID> {


    OwnerCrudOperation ownerCrudOperation;

    @Inject
    public OwnerCrudResource(OwnerCrudOperation ownerCrudOperation) {
        super(ownerCrudOperation);
        this.ownerCrudOperation = ownerCrudOperation;
    }
}
