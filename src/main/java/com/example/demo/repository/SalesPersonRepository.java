package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CommissionRules;
import com.example.demo.model.SalesPerson;

@Repository
public interface SalesPersonRepository extends JpaRepository<SalesPerson,Long> {

}
