package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SalesPerson;
import com.example.demo.service.SalesPersonService;



@RestController
//@RequestMapping("/salesPerson")
//@CrossOrigin(origins = "http://localhost:4200")
public class SalesPersonController {
	
	@Autowired
	SalesPersonService salesPersonService;
	
	@PostMapping("/addUser")
	public SalesPerson saveUser(@RequestBody SalesPerson salesPerson ) {
		
		salesPersonService.addUser(salesPerson);
		
		return salesPerson;
		
	}
	
	@DeleteMapping("/deleteSalesPerson/{salesPersonId}")
	public String deleteEmployee(@PathVariable (value = "salesPersonId") String salesPersonId) {
	
		this.salesPersonService.deleteSalesPersonById(salesPersonId);
		return "deleted Successfully";
	}
}
