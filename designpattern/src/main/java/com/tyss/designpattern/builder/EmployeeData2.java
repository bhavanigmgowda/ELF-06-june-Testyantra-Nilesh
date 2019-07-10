package com.tyss.designpattern.builder;

import java.util.Date;

public class EmployeeData2 {

	private int id;

	private int age;

	private String name;
	private String gender;
	private double salary;
	private long phone;
	private String email;
	private String designation;
	private Date dob;
	private long account_no;
	private Date joining_date;
	private int dept_ID;
	private int manager_ID;

	// constructor

	private EmployeeData2(EmployeeDataBuilder builder) {
		id = builder.id;
		age = builder.age;
		name = builder.name;
		gender = builder.gender;
		salary = builder.salary;
		phone = builder.phone;
		email = builder.email;
		designation = builder.designation;
		dob = builder.dob;
		account_no = builder.account_no;
		dept_ID = builder.dept_ID;
		manager_ID = builder.manager_ID;

	}
    class  EmployeeDataBuilder{
    	
    	private int id;

    	private int age;

    	private String name;
    	private String gender;
    	private double salary;
    	private long phone;
    	private String email;
    	private String designation;
    	private Date dob;
    	private long account_no;
    	private Date joining_date;
    	private int dept_ID;
    	private int manager_ID;
    	
	public EmployeeDataBuilder id(int id) {
		this.id = id;
		return this;
	}

	public EmployeeDataBuilder age(int age) {
		this.age = age;
		return this;
	}

	public EmployeeDataBuilder name(String name) {
		this.name = name;
		return this;
	}

	public EmployeeDataBuilder gender(String gender) {
		this.gender = gender;
		return this;
	}

	public EmployeeDataBuilder salary(double salary) {
		this.salary = salary;
		return this;
	}

	public EmployeeDataBuilder phone(long phone) {
		this.phone = phone;
		return this;
	}

	public EmployeeDataBuilder email(String email) {
		this.email = email;
		return this;
	}

	public EmployeeDataBuilder designation(String designation) {
		this.designation = designation;
		return this;
	}

	public EmployeeDataBuilder dob(Date dob) {
		this.dob = dob;
		return this;
	}

	public EmployeeDataBuilder account_no(long account_no) {
		this.account_no = account_no;
		return this;
	}

	public EmployeeDataBuilder joining_date(Date joining_date) {
		this.joining_date = joining_date;
		return this;
	}

	public EmployeeDataBuilder dept_ID(int dept_ID) {
		this.dept_ID = dept_ID;
		return this;
	}

	public EmployeeDataBuilder manager_ID(int manager_ID) {
		this.manager_ID = manager_ID;
		return this;
	}
	  
	
    }
   
  
}
