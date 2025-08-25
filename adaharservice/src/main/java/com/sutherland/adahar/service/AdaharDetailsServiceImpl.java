package com.sutherland.adahar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutherland.adahar.entity.AdaharDetails;
import com.sutherland.adahar.repo.AdaharDetailsRepo;

@Service
public class AdaharDetailsServiceImpl implements AdaharDetailsService {

    @Autowired
    private AdaharDetailsRepo repo;

    @Override
    public String addAdaharDetails(AdaharDetails details) {
        repo.save(details);
        return details.getAdaharNumber();
    }

    @Override
    public List<AdaharDetails> getAllAdaharDetails() {
        return repo.findAll();
    }

    @Override
    public AdaharDetails getAdaharDetailsById(String adaharNumber) {
        return repo.findById(adaharNumber).orElse(null);
    }

    @Override
    public String verifyAdahar(String adaharNumber) {
        return repo.existsById(adaharNumber) ? "Adahar verified." : "Adahar not found.";
    }
}