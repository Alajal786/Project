package com.sutherland.adahar.service;

import java.util.List;

import com.sutherland.adahar.entity.AdaharDetails;

public interface AdaharDetailsService {
    String addAdaharDetails(AdaharDetails details);
    List<AdaharDetails> getAllAdaharDetails();
    AdaharDetails getAdaharDetailsById(String adaharNumber);
    String verifyAdahar(String adaharNumber);
}