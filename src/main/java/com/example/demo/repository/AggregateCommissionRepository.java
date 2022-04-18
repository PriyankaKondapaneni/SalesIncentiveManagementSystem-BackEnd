package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AggregateCommission;

@Repository
public interface AggregateCommissionRepository extends JpaRepository<AggregateCommission,Long> {

}
