package com.example.demo.service;

import javax.transaction.Transactional;

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

	@Transactional
	public void deleteSalesPersonById(String salesPersonId) {
		this.salesPersonRepository.deleteBySalesPersonId(salesPersonId);
		
	}

}
