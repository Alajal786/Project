package com.sutherland.adaharservice.dto;

public class CreditScore {

	    private String aadhaarNumber;
	    private String name;
	    private String dob;
	    private String address;

	    public String getAadhaarNumber() {
	        return aadhaarNumber;
	    }

	    public void setAadhaarNumber(String aadhaarNumber) {
	        this.aadhaarNumber = aadhaarNumber;
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
	        return "AadhaarDetails [aadhaarNumber=" + aadhaarNumber + ", name=" + name + ", dob=" + dob + ", address=" + address + "]";
	    }
	}

