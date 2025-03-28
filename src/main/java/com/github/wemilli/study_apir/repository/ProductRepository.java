package com.github.wemilli.study_apir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.wemilli.study_apir.model.Product;

@Repository
public interface ProductRepository
         extends JpaRepository<Product, Long> {

    
} 