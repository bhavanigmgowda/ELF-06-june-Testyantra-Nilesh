package com.tyss.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class EmployeeDAOFactory {

	
	  public EmployeeDAO getEmployeeDAOHibernateImpl() {
		  return new EmployeeDAOHibernateImpl();
	  }
	  
	 
}
