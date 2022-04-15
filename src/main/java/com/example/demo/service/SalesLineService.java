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
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.AggregateCommission;
import com.example.demo.model.SalesLine;
import com.example.demo.model.SalesPerson;
import com.example.demo.repository.AggregateCommissionRepository;
import com.example.demo.repository.CommissionRuleRepository;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.repository.SalesLineRepository;
import com.example.demo.repository.SalesPersonRepository;

@Service
public class SalesLineService {

	@Autowired
	SalesLineRepository salesLineRepository;
	
	@Autowired
	SalesPersonRepository salesPersonRepository;
	
	@Autowired
	ProductsRepository productsRepository;
	
	@Autowired
	CommissionRuleRepository commissionRulesRepository;
	
	@Autowired
	AggregateCommissionRepository aggregateCommissionRepository;
	
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
			
			int twoWheelerSold = salesPersonRepository.getTwoWheelerSold(data[1]);
			int threeWheelerSold = salesPersonRepository.getThreeWheelerSold(data[1]);
			int fourWheelerSold = salesPersonRepository.getFourWheelerSold(data[1]);
			int commercialSold = salesPersonRepository.getCommercialSold(data[1]);
			
			String productType = productsRepository.getProductType(data[2]);
			System.out.println(productType);
			if(productType.equalsIgnoreCase("two wheeler")) {
				salesPersonRepository.updateVehicleDetails(twoWheelerSold+1,threeWheelerSold, fourWheelerSold, commercialSold, data[1]);

			} else if (productType.equalsIgnoreCase("three wheeler")) {
				salesPersonRepository.updateVehicleDetails(twoWheelerSold,threeWheelerSold+1, fourWheelerSold, commercialSold, data[1]);

			} else if (productType.equalsIgnoreCase("four wheeler")) {
				salesPersonRepository.updateVehicleDetails(twoWheelerSold,threeWheelerSold, fourWheelerSold+1, commercialSold, data[1]);
		
			} else{
				salesPersonRepository.updateVehicleDetails(twoWheelerSold,threeWheelerSold, fourWheelerSold, commercialSold+1, data[1]);

			}
			
				
			float existingUptoDateCommission = salesPersonRepository.getUptoDateCommission(data[1]);	
			float upatedCommission = existingUptoDateCommission + commissionPrice;	
			salesPersonRepository.updateCommission(upatedCommission, data[1]);
			
			int exisiting_totalSales = salesPersonRepository.getTotalSales(data[1]);
			int updatedTotalSales = exisiting_totalSales + 1;
			salesPersonRepository.updateTotalSales(updatedTotalSales, data[1]);
			
			
			int salesPersonLevel = salesPersonRepository.getLevel(data[1]);
			String res= data[3];
			while(salesPersonLevel<3) {
				String repIdComm = res;
				int repLevel = salesPersonLevel +1;
				float getCommissionPer;
				if(repLevel == 1) {
					getCommissionPer = commissionRulesRepository.getLevel1Commission();
				}
				else if(repLevel == 2) {
					getCommissionPer = commissionRulesRepository.getLevel2Commission();
				}
				else {
					getCommissionPer = commissionRulesRepository.getLevel3Commission();
				}
					
				float repo_existing_uptodateCommission = salesPersonRepository.getUptodateCommission(repIdComm);
				float repo_saleCommission = commissionPrice * getCommissionPer;
				float repo_updatedCommission = repo_existing_uptodateCommission + repo_saleCommission;
				salesPersonRepository.updateCommission(repo_updatedCommission, repIdComm);
				
				res = salesPersonRepository.getReporterId(res);
				salesPersonLevel+=1;
			}
		
		}
	}

	public Collection<SalesLine> getMonthlySales(String month) {
		// TODO Auto-generated method stub
	Collection<SalesLine> retrieved = 	(Collection<SalesLine>) salesLineRepository.getMonthlySales(month);
	System.out.println(retrieved.size());
	return retrieved;		
	}
	
	public float getMonthlySalesPerPerson(String month, String salesPersonId) {
		// TODO Auto-generated method stub
		Collection<SalesLine> retrieved = 	(Collection<SalesLine>) salesLineRepository.getMonthlySalesPerPerson(month,salesPersonId);
		float totalMonthlyCommission = 0.0f;
		for(SalesLine salesLine: retrieved)
		{
			totalMonthlyCommission+=salesLine.getCommision();
		}
		
		AggregateCommission aggregateCommission = new AggregateCommission();
		aggregateCommission.setMonth(month);
		aggregateCommission.setSalesPersonId(salesPersonId);
		aggregateCommission.setCommission(totalMonthlyCommission);
		
		aggregateCommissionRepository.save(aggregateCommission);
		return totalMonthlyCommission;
	}


}

