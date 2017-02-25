package com.shaik.domain.entity;

import javax.persistence.Embeddable;

/**
 * Created by jabbars on 2/25/2017.
 */
@Embeddable
public class EContact {

    private String countryCode;
    private String zipCode;
    private Long phone;
    private String city;
    private String state;

    public EContact(String countryCode, String zipCode, Long phone, String city, String state) {
        this.countryCode = countryCode;
        this.zipCode = zipCode;
        this.phone = phone;
        this.city = city;
        this.state = state;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
