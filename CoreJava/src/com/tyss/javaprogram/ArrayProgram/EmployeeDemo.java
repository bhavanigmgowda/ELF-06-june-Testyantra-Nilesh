package com.tyss.javaprogram.ArrayProgram;

import java.util.Arrays;

import com.tyss.javaprogram.constructor.Empolyee;

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

			System.out.println("Name " + employee.getName());
			System.out.println("id " + employee.getId());
			System.out.println("=================");

		}

	}
}
