package com.example.demo.repository;

import java.util.Collection;

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
	
	@Query("select sl from SalesLine sl where monthname(sl.salesDate)=:month")
	public Collection<SalesLine> getMonthlySales(
	@Param("month") String month);
	
	@Query("select sl from SalesLine sl where monthname(sl.salesDate)=:month and salesPersonId = :salesPersonId")
	public Collection<SalesLine> getMonthlySalesPerPerson(
	@Param("month") String month,
	@Param("salesPersonId") String salesPersonId);
}
