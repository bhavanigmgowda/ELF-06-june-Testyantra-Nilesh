package com.tyss.javaprogram.implementinglamda;

import java.util.Comparator;
/**
 * 
 * @author Administrator
 *  
 */
public class EmployeeById implements Comparator<Employee>  
 {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		  if(o1.id>o2.id)
		  {
			  return 1;
		  }
		  else if (o1.id<o2.id)
		  {
			  return 1;
		  }
		  else
		  {
			  return 0;	  
		  }
		
	}
 
 }
