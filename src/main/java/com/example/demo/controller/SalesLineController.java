package com.example.demo.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.SalesLine;
import com.example.demo.service.SalesLineService;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/sales")
public class SalesLineController {
	
	@Autowired
	SalesLineService salesLineService;
	
	@PostMapping("/upload")
	public String setSalesDataInDB(@RequestParam("file")  MultipartFile file ) throws IOException, ParseException {
		salesLineService.saveSalesLineData(file);
		return "Upload Successfully!!";
	}
	@GetMapping("/getMonthlySales/{month}")
	public Collection<SalesLine> getMonthlySales(@PathVariable(value = "month") String month) {
		return this.salesLineService.getMonthlySales(month);
	}
	
	@GetMapping("/getMonthlySalesPerPerson/{month}/{salesPersonId}")
	public Collection<SalesLine>  getMonthlySalesPerPerson(@PathVariable(value = "month") String month, @PathVariable String salesPersonId) {
		return this.salesLineService.getMonthlySalesPerPerson(month,salesPersonId);   
	}
	
//	@GetMapping("/getCommission")
//	public int getCommission() {
//		return salesLineService.getCommission();
//	}
}
