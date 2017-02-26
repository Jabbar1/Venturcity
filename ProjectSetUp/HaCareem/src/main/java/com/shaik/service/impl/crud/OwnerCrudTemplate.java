package com.shaik.service.impl.crud;

import com.shaik.domain.entity.EOwner;
import com.shaik.domain.repository.OwnerRepository;
import com.shaik.mapper.OwnerMapper;
import com.shaik.model.Owner;
import com.shaik.service.impl.BaseEntityValidator;
import com.shaik.service.operations.crud.OwnerCrudOperation;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jabbars on 2/26/2017.
 */
@Named("OwnerCrudTemplate")
public class OwnerCrudTemplate extends BaseCrudTemplate<Owner, EOwner, UUID> implements OwnerCrudOperation {

    private OwnerRepository ownerRepository;

    @Inject
    public OwnerCrudTemplate(BaseEntityValidator<Owner> baseEntityValidator,
                             OwnerRepository ownerRepository) {
        super(ownerRepository, OwnerMapper.entity, OwnerMapper.model, OwnerMapper.update, baseEntityValidator);
        this.ownerRepository = ownerRepository;
    }
}
