package com.tyss.javaprogram.immutable;

public class Person {
	private final String name;
	private final int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}// end of class
