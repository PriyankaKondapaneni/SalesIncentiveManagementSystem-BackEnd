
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CommissionRules;


@Repository
public interface CommissionRuleRepository extends JpaRepository<CommissionRules,Long> {
	@Query("select cr.level1 from CommissionRules cr where cr.id  = 0")
	public float getLevel1Commission();
	@Query("select cr.level2 from CommissionRules cr where cr.id  = 0")
	public float getLevel2Commission();
	@Query("select cr.level3 from CommissionRules cr where cr.id  = 0")
	public float getLevel3Commission();

}
