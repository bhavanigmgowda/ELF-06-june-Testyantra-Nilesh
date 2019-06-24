package com.tyss.javaprogram.immutable;

import lombok.extern.java.Log;

@Log
public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e = new Employee("xyz", 5.5, true, 'M', 24);
		log.info("" + e.getName());
		log.info("" + e.getAge());
		log.info("" + e.getGender());

	}
}
