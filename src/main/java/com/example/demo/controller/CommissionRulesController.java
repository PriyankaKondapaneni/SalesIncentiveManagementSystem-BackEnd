package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CommissionModel;
import com.example.demo.model.SalesPerson;
import com.example.demo.service.CommissionRulesService;
import com.example.demo.service.SalesPersonService;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/admin")
public class CommissionRulesController {
	@Autowired
	CommissionRulesService cmService;
	@GetMapping("/rules")
	public List<CommissionModel> getAllUsers(){
		return cmService.findAll();
	}
	

}
