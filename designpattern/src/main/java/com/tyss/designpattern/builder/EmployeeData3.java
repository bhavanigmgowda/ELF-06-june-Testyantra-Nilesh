package com.tyss.designpattern.builder;

import java.util.Date;

import lombok.Builder;
import lombok.ToString;
@Builder
@ToString
public  class EmployeeData3 {
	
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


}
