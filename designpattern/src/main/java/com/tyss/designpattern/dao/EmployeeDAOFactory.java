package com.tyss.designpattern.dao;

public class EmployeeDAOFactory {

	private static String dbIntractionType="jdbc";
	
	private EmployeeDAOFactory()
	{
		
	}
	
	 public static EmployeeDAO getIntance()
	 { 
		 EmployeeDAO dao=null;
		  if(dbIntractionType.equals("jdbc"))
		  {
			  dao=new EmployeeDAOJDBCImpl();
		  }
		  else if(dbIntractionType.equals("hibernate"))
		  {
			  dao=new EmployeeDAOHibernateImpl();
		  }
		  return dao;
	 }
	 
	 
}
