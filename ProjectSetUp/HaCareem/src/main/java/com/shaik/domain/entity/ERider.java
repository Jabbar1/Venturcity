package com.shaik.domain.entity;

import javax.persistence.Entity;

/**
 * Created by jabbars on 2/25/2017.
 */
@Entity(name = "RIDER")
public class ERider extends EUser {

    // Some More details


    public ERider() {

    }

    public ERider(String name, EContact contact) {
        super(name, contact);
    }
}
