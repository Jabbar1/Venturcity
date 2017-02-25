package com.shaik.service.operations;

import com.shaik.model.User;

import java.io.Serializable;

/**
 * Created by jabbars on 2/25/2017.
 */
public interface UserOperations<U extends User,ID extends Serializable>
        extends BaseCrudOperations<U,ID> {

}
