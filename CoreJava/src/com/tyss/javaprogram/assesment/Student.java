package com.tyss.javaprogram.assesment;

public class Student {

	String name;
	String gender;
	double ttlmarks;
	double attendence;
    int rollNumber;
    double percent;
	  public Student() {
		super();
	}
	  
	  
	  

	public Student(int rollNumber,String name, double percent) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.percent = percent;
	}




	public Student(double attendence) {
		super();
		this.attendence = attendence;
	}

	public Student(String name, String gender, double ttlmarks) {
		super();
		this.name = name;
		this.gender = gender;
		this.ttlmarks = ttlmarks;
	}

	@Override
	public String toString() {
		return this.name + " " + this.gender + " " + this.ttlmarks;
	}
	
	
}