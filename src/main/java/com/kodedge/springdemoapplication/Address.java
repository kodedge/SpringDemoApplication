package com.kodedge.springdemoapplication;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private int addressId;
    private int zipCode;
    private String city;
}
