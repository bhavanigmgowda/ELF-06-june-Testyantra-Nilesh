package com.tyss.javaprogram.log;
import java.io.Serializable;

public class Person implements Serializable{
	
    private	String name;
    transient private int age;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
