package com.sutherland.adahar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdaharDetails {

    @Id
    private String adaharNumber;
    private String name;
    private String dob;
    private String address;

    public String getAdaharNumber() {
        return adaharNumber;
    }

    public void setAdaharNumber(String adaharNumber) {
        this.adaharNumber = adaharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AdaharDetails [adaharNumber=" + adaharNumber + ", name=" + name + ", dob=" + dob + ", address=" + address + "]";
    }
}