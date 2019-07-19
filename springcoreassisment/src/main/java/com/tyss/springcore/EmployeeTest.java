package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;;
@Log
public class EmployeeTest {
          public static void main(String[] args) {
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("employeebean.xml");
			EmployeeBean bean=(EmployeeBean) applicationContext.getBean("employee1");
	              		
			log.info(""+bean.getName());
			log.info(""+bean.getAge());
			
		}
}
