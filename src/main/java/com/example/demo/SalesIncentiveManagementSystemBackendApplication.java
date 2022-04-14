package com.example.demo;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Admin;
import com.example.demo.model.CommissionModel;
import com.example.demo.model.CommissionRules;
import com.example.demo.model.Products;
import com.example.demo.model.SalesLine;
import com.example.demo.model.SalesPerson;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CommissionModelRepository;
import com.example.demo.repository.CommissionRuleRepository;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.repository.SalesLineRepository;
import com.example.demo.repository.SalesPersonRepository;
import com.example.demo.repository.SalesLineRepository;

@SpringBootApplication
public class SalesIncentiveManagementSystemBackendApplication implements CommandLineRunner{
	
	@Autowired
	CommissionRuleRepository commissionRule;
	
	@Autowired
	ProductsRepository productsRepo;
	
	@Autowired
	SalesPersonRepository salesPersonRepository;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	CommissionModelRepository commissionModelRepository;
	
	@Autowired
	SalesLineRepository salesLineRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SalesIncentiveManagementSystemBackendApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		CommissionRules rule1 = new CommissionRules(0.1f, 0.2f, 0.5f);
//		commissionRule.save(rule1);
		
//		productsRepo.saveAll(List.of(
//				new Products("P1", "Honda Activa", "two wheeler", "Honda", 52000.0f, "2WR3"),
//				new Products("P2", "Hero HF Deluxe", "two wheeler", "Hero", 39000.0f, "2WR2"),
//				new Products("P3", "Bajaj Pulsar", "two wheeler", "Bajaj", 28000.0f, "2WR1"),
//				new Products("P4", "Bajaj Compact RE", "three wheeler", "Bajaj", 275000.0f, "3WR1"),
//				new Products("P5", "Kia Carens", "four wheeler", "Kia", 975000.0f, "4WR1"),
//				new Products("P5", "MahindraXUV700", "four wheeler", "Mahindra", 1275000.0f, "4WR2"),
//				new Products("P6", "Tata Signa", "commercial vehicle", "Tata", 5675000.0f, "CVR2"),
//				new Products("P7", "Tata Ultra", "commercial vehicle", "Tata", 1046000.0f, "CVR1")
//				)
//				);
		
	SalesPerson first = new SalesPerson("SP1", "password", "kalyani", "sales", "hyderabad", 10,"SP2", 2, 2,3,4,5,14,100000.0f);
      salesPersonRepository.save(first);
//        SalesPerson second = new SalesPerson("SP2", "password2", "christina", "sales", "banglore", 12, "SP3", 2, 2,3,4,6,15,120000.0f);
//        salesPersonRepository.save(second);
//        SalesPerson third = new SalesPerson("SP3", "password3", "mythli", "sales", "mumbai", 14, "SP2", 2, 2,3,4,6,15,130000.0f);
//        salesPersonRepository.save(third);
//		  SalesPerson four = new SalesPerson("SP4", "password4", "sanju", "sales", "chennai", 15,"SP5", 2, 2,3,4,6,15,130000.0f);
//	        salesPersonRepository.save(four);
		
//		commissionModelRepository.saveAll(List.of(
//				new CommissionModel("2WR1", 3),
//				new CommissionModel("2WR2", 5),
//				new CommissionModel("2WR3", 8),
//				new CommissionModel("3WR1", 3),
//				new CommissionModel("3WR2", 5),
//				new CommissionModel("4WR1", 4),
//				new CommissionModel("4WR2", 6),
//				new CommissionModel("4WR3", 10),
//				new CommissionModel("CVR1", 6),
//				new CommissionModel("CVR2", 11)
//				)
//				);
		
		Admin firstA = new Admin("A1","Admin1","Admin@1");
       adminRepository.save(firstA);
//        Admin secondA = new Admin("A2","Admin2","Admin@2");
//        adminRepository.save(secondA);
	        
//			DateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");  
//			Date d1 = (Date) formatter1.parse("13-04-2022");
//	        SalesLine sl1 =new SalesLine("SL1","P1", "SP1", d1 ,10000.0f, "SP2", 3000.0f );
//	        salesLineRepository.save(sl1);
//	        
//	        DateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy");  
//			Date d2 = (Date) formatter2.parse("11-04-2022");
//	        SalesLine sl2 =new SalesLine("SL2","P2", "SP2", d1 ,20000.0f, "SP4", 6000.0f );
//	        salesLineRepository.save(sl2);
//	        
//	        DateFormat formatter3 = new SimpleDateFormat("dd-MM-yyyy");  
//			Date d3 = (Date) formatter3.parse("13-04-2022");
//	        SalesLine sl3 =new SalesLine("SL3","P3", "SP3", d1 ,25000.0f, "SP2", 8000.0f );
//	       salesLineRepository.save(sl3);
	       
	}

}
