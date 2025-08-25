package com.sutherland.aadhar.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sutherland.aadhaar.model.AadhaarDetails;

@FeignClient(name = "aadhaar-service")
public interface AadhaarServiceProxy {

    @GetMapping("/aadhaar/{id}")
    AadhaarDetails getAadhaarDetails(@PathVariable("id") String id);
}