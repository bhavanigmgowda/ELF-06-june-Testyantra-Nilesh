package com.tyss.javaprogram.implementinglamda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;
@Log
public class TestA {

	public static void main(String[] args) {

		EmployeeById ei = new EmployeeById();

		Employee e1 = new Employee("suresh", 1, 22500);
		Employee e2 = new Employee("ramesh", 2, 2540);
		Employee e3 = new Employee("rajesh", 5, 50024);
		Employee e4 = new Employee("mahesh", 4, 6520);
		
		
		Comparator<Employee> c=(e,f)->{
			        if(e.id>f.id)
			        {
			        	return 1;
			        }
			        else if(e.id<f.id)
			        {
			        	return -1;
			        }
			        else
			        {
			        	return 0;
			        }
			        
		};
		
		
		
		Comparator<Employee> c2=(e,f)->  e.name.compareTo(f.name);
	           
	         
   
		

		TreeSet<Employee> ts = new TreeSet<Employee>(c2);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		
		for (Employee e : ts) {
			log.info(""+e.id);
			log.info(""+e.name);
			log.info(""+e.salary);
		}
	}

}
