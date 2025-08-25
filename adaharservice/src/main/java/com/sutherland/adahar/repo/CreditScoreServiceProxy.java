package com.sutherland.adahar.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sutherland.adahar.dto.CreditScore;

@FeignClient(name = "creditscore-service")
public interface CreditScoreServiceProxy {

    @GetMapping("/creditscore/{pancard}")
    CreditScore getCreditScore(@PathVariable("pancard") String pancard);
}