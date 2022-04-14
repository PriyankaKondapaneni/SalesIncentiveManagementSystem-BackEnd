package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SalesPerson;
import com.example.demo.repository.SalesRepository;


@Service
public class SalesService {
	 @Autowired
	    private SalesRepository userRepository;
	 public SalesPerson login(SalesPerson user) {
	        SalesPerson existingUser = new SalesPerson();
	        		existingUser= userRepository.findBySalesPersonId(user.getSalesPersonId())
;
	        if(existingUser.getSalesPersonId().equals(user.getSalesPersonId()) &&
	                existingUser.getPassword().equals(user.getPassword()) &&
	                existingUser.getRole().equals(user.getRole())) {
	            existingUser.setPassword("");
	            return existingUser;
	        }

	        return null;

	    }
	public SalesPerson getSpecificUsers(String salesPersonId) {
		return this.userRepository.findBySalesPersonId(salesPersonId);
	}
	
}
