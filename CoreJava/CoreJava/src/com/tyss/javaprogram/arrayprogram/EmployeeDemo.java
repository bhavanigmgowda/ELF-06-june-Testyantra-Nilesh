package com.tyss.javaprogram.arrayprogram;

import java.util.Arrays;


import lombok.extern.java.Log;

@Log
public class EmployeeDemo {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("mahesh");
		e1.setId(1);
		Employee e2 = new Employee();
		e2.setName("dinesh");
		e2.setId(2);
		Employee e3 = new Employee();
		e3.setName("Ramesh");
		e3.setId(3);
		Employee emp[] = { e1, e2, e3 };

		Arrays.sort(emp);
		for (Employee employee : emp) {

			log.info("Name " + employee.getName());
			log.info("id " + employee.getId());
			log.info("=================");

		}

	}
}
