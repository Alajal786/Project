package com.sutherland.adahar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sutherland.adahar.repo.CreditScoreServiceProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = CreditScoreServiceProxy.class)


public class AdaharDetailsApp {

	public static void main(String[] args) {
		SpringApplication.run(AdaharDetailsApp.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


	}


