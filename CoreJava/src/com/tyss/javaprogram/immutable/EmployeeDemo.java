package com.tyss.javaprogram.immutable;

public class EmployeeDemo {
    public static void main(String[] args) {
		Employee e=new Employee("xyz", 5.5, true,'M',24);
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getGender());
		
	}
}
