package com.sutherland.aadhaarservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sutherland.aadhaar.repo.AadhaarServiceProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = AdaharServiceProxy.class)
public class AdaharDetails {

    public static void main(String[] args) {
        SpringApplication.run(AdaharDetails.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
