package com.example.firstboy.dao;

import com.example.firstboy.model.Rofl;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDAO extends JpaRepository<Rofl, Integer> {
    
}
