package com.sutherland.adahar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sutherland.adahar.entity.AdaharDetails;
import com.sutherland.adahar.service.AdaharDetailsService;

@RestController
@RequestMapping("/adahar")
public class AdaharDetailsController {

    @Autowired
    private AdaharDetailsService service;

    @PostMapping
    public ResponseEntity<String> addAdaharDetails(@RequestBody AdaharDetails details) {
        String id = service.addAdaharDetails(details);
        return ResponseEntity.ok("Adahar details added. ID: " + id);
    }

    @GetMapping
    public ResponseEntity<List<AdaharDetails>> getAllAdaharDetails() {
        return ResponseEntity.ok(service.getAllAdaharDetails());
    }

    @GetMapping("/{adaharNumber}")
    public ResponseEntity<AdaharDetails> getAdaharDetails(@PathVariable String adaharNumber) {
        return ResponseEntity.ok(service.getAdaharDetailsById(adaharNumber));
    }

    @GetMapping("/verify/{adaharNumber}")
    public ResponseEntity<String> verifyAdahar(@PathVariable String adaharNumber) {
        return ResponseEntity.ok(service.verifyAdahar(adaharNumber));
    }
}