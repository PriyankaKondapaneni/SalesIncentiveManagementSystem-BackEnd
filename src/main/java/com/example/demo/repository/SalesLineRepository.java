package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SalesLine;

@Repository
public interface SalesLineRepository extends CrudRepository<SalesLine, Long> {
	
	@Query("select cm.commission  from CommissionModel cm where cm.range = (select p.range from Products p where p.productId = (select sl.productId from SalesLine sl where sl.salesLineId = :salesLineId))")
	public Integer findCommission(
	@Param("salesLineId") String salesLineId);
}
