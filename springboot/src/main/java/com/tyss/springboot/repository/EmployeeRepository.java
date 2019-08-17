package com.tyss.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tyss.springboot.dto.EmployeeInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean,Integer> {

	
	
}
