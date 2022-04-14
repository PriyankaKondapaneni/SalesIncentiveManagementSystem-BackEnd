package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SalesLine;

@Repository
public interface salesLineRepository extends JpaRepository<SalesLine, Long> {

}
