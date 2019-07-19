package com.tyss.springcore.usingAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.beans.Department;
@Configuration
public class DeptConfig {
	
	 @Bean(name="hr")
	  public Department getDepartmentHr() {
		  Department department=new Department();
		  department.setDeptId(201);
		  department.setDeptName("Hr");
		  return department;
		  
	  }
	 @Bean(name="testing")
	  public Department getDepartmentTesting() {
		  Department department=new Department();
		  department.setDeptId(202);
		  department.setDeptName("Testing");
		  return department;
		  
	  }
	 @Bean(name="developer")
	  public Department getDepartmentDevelopment() {
		  Department department=new Department();
		  department.setDeptId(203);
		  department.setDeptName("Development");
		  return department;
		  
	  }
	  

}
