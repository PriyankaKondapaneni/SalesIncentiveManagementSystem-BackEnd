package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CommissionModel;

@Repository
public interface CommissionModelRepository extends JpaRepository<CommissionModel, Long>{
	
}
