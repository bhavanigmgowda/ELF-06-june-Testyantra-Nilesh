package com.tyss.javaprogram.employee;

import java.util.Date;

public class EmployeeBean {
	private int id;
	private String name;
	private String Deparment;
	private double salary;
	private int age;
	private Date date;
	private String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeparment() {
		return Deparment;
	}

	public void setDeparment(String deparment) {
		Deparment = deparment;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", Deparment=" + Deparment + ", salary=" + salary
				+ ", age=" + age + ", date=" + date + ", Gender=" + gender + "]";
	}
	
}
