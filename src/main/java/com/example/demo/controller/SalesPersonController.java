package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SalesPerson;
import com.example.demo.service.SalesPersonService;



@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/salesPerson")
public class SalesPersonController {
	
	@Autowired
	SalesPersonService salesPersonService;
	@GetMapping("/users")
	public List<SalesPerson> getAllUsers(){
		return salesPersonService.findAll();
	}

	@PostMapping("/addSalesPerson")
	public SalesPerson saveUser(@RequestBody SalesPerson salesPerson ) {
		salesPersonService.addUser(salesPerson);
		return salesPerson;	
	}
	
	@DeleteMapping("/deleteSalesPerson/{salesPersonId}")
	public void deleteEmployee(@PathVariable String salesPersonId) {
	
		this.salesPersonService.deleteSalesPersonById(salesPersonId);	}
	
}
