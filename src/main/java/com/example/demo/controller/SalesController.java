package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.model.SalesPerson;
import com.example.demo.repository.SalesLineRepository;
import com.example.demo.service.AdminService;
import com.example.demo.service.SalesService;

@RestController
@RequestMapping("/sales")
@CrossOrigin(origins = "http://localhost:4200")
public class SalesController {

	@Autowired
	   private SalesService salesService;
	    @Autowired
	    private AdminService adminService;
	    @Autowired
	    private SalesLineRepository slRepo;

	   @PostMapping("/login")
	   public SalesPerson login(@RequestBody SalesPerson user) {

	        return salesService.login(user);
	    }
	   @PostMapping("/adminlogin")
	   public Admin adminlogin(@RequestBody Admin user) {

	        return adminService.login(user);
	    }
	   @GetMapping("/specificusers")
		public SalesPerson getSpecificUsers(@RequestParam("salesPersonId")String salesPersonId){
			return this.salesService.getSpecificUsers(salesPersonId);
		}
}
