package com.tyss.javaprogram.implementinglamda;

import lombok.Data;

/**
 * employee bean class
 */
@Data
public class Employee {
	String name;
	int id;
	int salary;
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}// end of method
	
}// end of class
