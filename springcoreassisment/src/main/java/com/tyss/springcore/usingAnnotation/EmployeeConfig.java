package com.tyss.springcore.usingAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.tyss.springcore.beans.Department;
import com.tyss.springcore.beans.EmployeeBean;

@Configuration
@Import(DeptConfig.class)
public class EmployeeConfig {
     
	@Bean
	  public EmployeeBean getEmployeeBean()
	  {
		  EmployeeBean bean=new EmployeeBean();
		  bean.setName("Rana");
		  bean.setAge(27);
		  return bean;
	  }
	  
	 
}
