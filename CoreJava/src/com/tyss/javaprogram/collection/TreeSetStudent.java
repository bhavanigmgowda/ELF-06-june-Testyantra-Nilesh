package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetStudent {
	
	public static void main(String[] args) {
	     Student s1=new  Student();
	     s1.id=1;
	     s1.name="Dinesh";
	     s1.percentage=66.14;
	     
	     Student s2=new  Student();
	     s2.id=2;
	     s2.name="Ramesh";
	     s2.percentage=77.14;
	     
	     Student s3=new  Student();
	     s3.id=3;
	     s3.name="Rajesh";
	     s3.percentage=54.14;
	     
	     
	     
	     TreeSet<Student> ar=new TreeSet<Student>();
	     ar.add(s1);
	     ar.add(s2);
	     ar.add(s3);
	     
	     
	     
	     for (Student student : ar) {
			System.out.println(student.name);
			System.out.println(student.id);
			System.out.println(student.percentage);
		}
	     

}
}
