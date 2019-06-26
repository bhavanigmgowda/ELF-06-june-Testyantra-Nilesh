package com.tyss.javaprogram.constructor;
import lombok.extern.java.Log;
@Log
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
    	log.info(""+"name="+name +"\nage= "+age+"\npercent= "+per);
    }
}
