package com.tyss.javaprogram.immutable;

public class Employee {
	private final String name;
	private final double height;
	private final boolean status;
	private final char gender;
	private final int age;

	public Employee(String name, double height, boolean status, char gender, int age) {
		super();
		this.name = name;
		this.height = height;
		this.status = status;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public boolean isStatus() {
		return status;
	}

	public char getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

}
