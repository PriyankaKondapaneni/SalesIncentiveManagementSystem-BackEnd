package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SalesPerson;


public interface SalesRepository extends JpaRepository<SalesPerson,Long> {

//	public SalesPerson findByUserName(String userName);

}
