package com.constants;

public class Address {
    String street;
    String city;
    String state;
    String country;
    int zipCode;

    public Address(String street, String city, String state, String country, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }
}
