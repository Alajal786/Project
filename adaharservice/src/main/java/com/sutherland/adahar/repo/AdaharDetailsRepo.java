package com.sutherland.adahar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutherland.adahar.entity.AdaharDetails;

@Repository
public interface AdaharDetailsRepo extends JpaRepository<AdaharDetails, String> {
}