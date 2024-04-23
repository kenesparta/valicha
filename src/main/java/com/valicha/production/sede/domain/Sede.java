package com.valicha.production.sede.domain;

import com.valicha.shared.domain.StringValueObject;
import jakarta.persistence.*;


public class Sede {

    private Long id;

    private StringValueObject name;



    private Address address;
    private LocationState state;

    public Sede(Long id, StringValueObject name, Address address, LocationState state) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.state = state;
    }

    public StringValueObject getName() {
        return name;
    }

    public void setName(StringValueObject name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocationState getState() {
        return state;
    }

    public void setState(LocationState state) {
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
