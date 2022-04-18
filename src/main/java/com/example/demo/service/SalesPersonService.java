package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SalesPerson;
import com.example.demo.repository.SalesPersonRepository;


@Service
public class SalesPersonService {
	
	@Autowired
	SalesPersonRepository salesPersonRepository;
	
	public void addUser(SalesPerson salesPerson) {
		this.salesPersonRepository.save(salesPerson);
	}

	public void deleteSalesPersonById(String salesPersonId) {
		SalesPerson sp= this.salesPersonRepository.findBySalesPersonId(salesPersonId);
		this.salesPersonRepository.delete(sp);
		
	}

	public List<SalesPerson> findAll() {
		return (List<SalesPerson>) salesPersonRepository.findAll();
	}

}
