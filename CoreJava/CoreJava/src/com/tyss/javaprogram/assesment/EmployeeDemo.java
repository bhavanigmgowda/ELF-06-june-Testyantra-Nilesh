package com.tyss.javaprogram.assesment;

import lombok.extern.java.Log;

@Log
public class EmployeeDemo {
	
	public static void main(String[] args) {
	
		Employee employee=new Employee("Ankur",22);
		 Employee employeetwo=new Employee("Aman",21);
		 
		 Employee employeethree=new Employee("Ankur",22);
		 
		 log.info(""+ employee.equals(employeetwo));
		 log.info(""+employee.equals(employeethree));
		
		
	}
 
	 
	   
	 
}
