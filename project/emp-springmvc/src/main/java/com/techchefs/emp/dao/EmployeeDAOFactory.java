package com.techchefs.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {

	@Bean("hibernate")
	public EmployeeDAO getEmployeeDAOHibernateImpl() {
		return new EmployeeDAOHibernateImpl();
	}
	
	@Bean("jdbc")
	public EmployeeDAO EmployeeDAOJDBCImpl() {
		return new EmployeeDAOJDBCImpl();
	}
}
