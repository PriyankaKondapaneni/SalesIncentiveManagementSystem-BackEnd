package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{
	@Query("select p.productType from Products p where p.productId =:productId")
	public String getProductType(@Param("productId") String productId);
	
}
