package com.github.wemilli.study_apir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.wemilli.study_apir.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    // Custom query methods can be defined here if needed

    
} 