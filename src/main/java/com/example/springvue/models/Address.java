package com.example.springvue.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(catalog = "livestream", name = "addresses", schema = "livestream")
@GenericGenerator(name = "uuid", strategy = "uuid2")
public class Address {

    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "address_uuid", length = 36, unique = true, nullable = false)
    private String addressUuid;

    @Column(name = "address", length = 200)
    private String address;

    @Column(name = "city", length = 200)
    private String city;

    @Column(name = "state", length = 200)
    private String state;

    @Column(name = "zip_code", length = 10)
    private String zipCode;

    public Address() {
        this.address = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
    }

    public String getAddressUuid() {
        return addressUuid;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setAddressUuid(String addressUuid) {
        this.addressUuid = addressUuid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}