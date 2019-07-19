package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.EmployeeBean;
import com.tyss.springcore.usingAnnotation.EmployeeConfig;

import lombok.extern.java.Log;
@Log
public class EmoloyeeWireTest {

	
	  public static void main(String[] args) {
		
		 ApplicationContext applicationContext=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean bean=  applicationContext.getBean(EmployeeBean.class);
		
		   log.info(""+bean.getName());
		   log.info(""+bean.getAge());
		   log.info(""+bean.getDepartment().getDeptId());
		   log.info(""+bean.getDepartment().getDeptName());
 
	}
}
