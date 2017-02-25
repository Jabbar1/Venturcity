package com.shaik.domain.entity;

import javax.persistence.*;

/**
 * Created by jabbars on 2/25/2017.
 */
@MappedSuperclass
public class EUser {

    /**
     * For time being I am using Long.
     * In Actual Case we should use UUID, which will guarantee Uniqueness
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String country;
    private EContact contact;
    private Version version;

    public EUser(String name, String country, EContact contact) {
        this.name = name;
        this.country = country;
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public EContact getContact() {
        return contact;
    }

    public void setContact(EContact contact) {
        this.contact = contact;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}
