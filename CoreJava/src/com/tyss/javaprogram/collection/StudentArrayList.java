package com.tyss.javaprogram.collection;

import java.util.ArrayList;

public class StudentArrayList {
  
	
	 public static void main(String[] args) {
	     Student s1=new  Student();
	     s1.id=1;
	     s1.name="Dinesh";
	     s1.percentage=66.14;
	     
	     Student s2=new  Student();
	     s2.id=2;
	     s2.name="Ramesh";
	     s2.percentage=67.14;
	     
	     Student s3=new  Student();
	     s3.id=2;
	     s3.name="Ramesh";
	     s3.percentage=67.14;
	     
	     
	     
	     ArrayList<Student> ar=new ArrayList<Student>();
	     ar.add(s1);
	     ar.add(s2);
	     ar.add(s3);
	     
	     
	     
	     for (int i = 0; i <ar.size(); i++) 
	     {
		       Student s=ar.get(i);
		      
		       System.out.println("name "+s.name);
		       System.out.println("id "+s.id);
		       System.out.println("percentage "+s.percentage);
		}
	     
	}
}
