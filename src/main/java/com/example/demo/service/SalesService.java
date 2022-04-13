package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SalesPerson;
import com.example.demo.repository.SalesRepository;


@Service
public class SalesService {
	 @Autowired
	    private SalesRepository salesRepo;
	 public SalesPerson login(SalesPerson sp) {
	    	SalesPerson existingSp = salesRepo.findByUserName(sp.getUserName());

	        if(existingSp.getUserName().equals(sp.getUserName()) &&
	                existingSp.getPassword().equals(sp.getPassword()) &&
	                existingSp.getRole().equals(sp.getRole())) {
	            existingSp.setPassword("");
	            return existingSp;
	        }

	        return null;

	    }
}
