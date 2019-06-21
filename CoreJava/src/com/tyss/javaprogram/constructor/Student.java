package com.tyss.javaprogram.constructor;

public class Student {
	String name;
	int age;
	double per;
    Student(String n,int a,double p)
    {
    	name=n;
    	age=a;
    	per=p;
    }
    void a()
    {
    	System.out.println("name="+name +"\nage= "+age+"\npercent= "+per);
    }
}
