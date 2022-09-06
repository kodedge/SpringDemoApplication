package com.kodedge.springdemoapplication;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    @Embedded
    private Address address;
}
