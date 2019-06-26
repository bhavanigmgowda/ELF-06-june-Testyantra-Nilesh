package com.tyss.javaprogram.collection;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "Amit";
		e1.salary = 15000;

		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "Shubham";
		e2.salary = 90000;

		Employee e3 = new Employee();
		e3.id = 3;
		e3.name = "Yash";
		e3.salary = 25000;

		Employee e4 = new Employee();
		e4.id = 4;
		e4.name = "Pritesh";
		e4.salary = 25101;

		@SuppressWarnings("unused")
		EmployeeById ei = new EmployeeById();
		@SuppressWarnings("unused")
		EmployeeBySalary es = new EmployeeBySalary();
		EmployeeByName en = new EmployeeByName();

		TreeSet<Employee> ts = new TreeSet<Employee>(en);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		for (Employee employee : ts) {

			log.info("ID is " + employee.id);
			log.info("Name is " + employee.name);
			log.info("salary is " + employee.salary);
		}
	}

}
