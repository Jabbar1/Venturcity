package com.shaik.service.impl.ride;

import com.shaik.domain.entity.EOwner;
import com.shaik.domain.repository.OwnerRepository;
import com.shaik.model.Invoice;
import com.shaik.model.Owner;
import com.shaik.service.operations.ride.OwnerOperations;

import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
@Named("hcOwnerTemplate")
public class OwnerTemplate extends CabTemplate<Owner,EOwner,UUID>  implements OwnerOperations{

    private OwnerRepository ownerRepository;

    public OwnerTemplate(OwnerRepository ownerRepository) {
        super(ownerRepository);
        this.ownerRepository = ownerRepository;
    }

    /**
     * OverRiding RideOperations which are not valid for Owner and Throw NotSupported Exception
     *
     * @return
     */

    @Override
    public Boolean finish() {
        throw new  UnsupportedOperationException("Operation not supported for Owner");
    }

    @Override
    public Boolean changeDirection() {
        throw new  UnsupportedOperationException("Operation not supported for Owner");
    }

    @Override
    public Invoice invoice() {
        throw new  UnsupportedOperationException("Operation not supported for Owner");
    }

}
