package com.tyss.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tyss.springboot.dto.EmployeeInfoBean;
import com.tyss.springboot.dto.EmployeeOtherInfoBean;

public interface EmployeeRepository extends JpaRepository<EmployeeInfoBean,Integer> {

	@Query("Select e from EmployeeOtherInfoBean e where e.infoBean=:id")
	public  EmployeeOtherInfoBean findByEmpId(@Param("id") EmployeeInfoBean id);
		

	
}
