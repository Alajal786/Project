package com.sutherland.adaharservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sutherland.adaharservice.entity.AdaharDetails;
import com.sutherland.adaharservice.service.AdaharDetailsService;

@RestController

@RequestMapping("/adahar")
public class AdaharDetailsController {

    @Autowired
    private AdaharDetailsService service;

    @PostMapping
    public ResponseEntity<String> addAdaharDetails(@RequestBody AdaharDetails details) {
        String id = service.addAdaharDetails(details);
        return new ResponseEntity<>("Adahar details added. ID: " + id, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<AdaharDetails>> getAllAdaharDetails() {
        return new ResponseEntity<>(service.getAllAdaharDetails(), HttpStatus.OK);
    }

    @GetMapping("/{adaharNumber}")
    public ResponseEntity<AdaharDetails> getAdaharDetails(@PathVariable String adaharNumber) {
        AdaharDetails details = service.getAdaharDetailsById(adaharNumber);
        return new ResponseEntity<>(details, HttpStatus.OK);
    }

    @GetMapping("/verify/{adaharNumber}")
    public ResponseEntity<String> verifyAdahar(@PathVariable String adaharNumber) {
        String message = service.verifyAdahar(adaharNumber);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}