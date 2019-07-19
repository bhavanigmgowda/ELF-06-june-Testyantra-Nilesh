package com.tyss.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;
@Log
public class EmployeeWiringTest {
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeBean bean = (EmployeeBean) applicationContext.getBean("employee1");
		
		 log.info(""+bean.getName());
		 log.info(""+bean.getAge());
		 log.info(""+bean.getDepartment().getDeptId());
		 log.info(""+bean.getDepartment().getDeptName());
		 
		 
		
		
		((AbstractApplicationContext)applicationContext).close();

	}// End of method

}
