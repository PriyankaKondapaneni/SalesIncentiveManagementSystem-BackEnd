package com.example.demo.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.SalesLine;
import com.example.demo.model.SalesPerson;
import com.example.demo.repository.SalesLineRepository;

@Service
public class SalesLineService {

	@Autowired
	SalesLineRepository salesLineRepository;
	String line = "";
	
	public void saveSalesLineData(MultipartFile file) throws IOException, ParseException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream(), "UTF-8"));
		while((line = br.readLine()) != null) {
			DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
			String[] data = line.split(",");
			SalesLine salesLine = new SalesLine();
			salesLine.setSalesLineId(data[0]);
			

			salesLine.setSalesPersonId(data[1]);
			salesLine.setProductId(data[2]);
			salesLine.setReportingId(data[3]); 	
			salesLine.setSalesDate(formatter.parse(data[4]));
			salesLine.setSalesPrice(Float.parseFloat(data[5]));
			salesLine.setCommision(0);
			salesLineRepository.save(salesLine);
			
			int commissionPer =  salesLineRepository.findCommission(data[0]);
//			System.out.println("Commission Per"+commissionPer);
			float commissionPrice = (float) (Float.parseFloat(data[5]) * (commissionPer/100.0));
//			System.out.println("Commission Price "+commissionPrice);
			salesLine.setCommision(commissionPrice);
			salesLineRepository.save(salesLine);
		}
	}
}
