package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CommissionModel;
import com.example.demo.repository.CommissionModelRepository;

@Service
public class CommissionRulesService {
	@Autowired
	CommissionModelRepository cmRepo;
	public List<CommissionModel> findAll() {
		return (List<CommissionModel>) cmRepo.findAll();
	}
}
