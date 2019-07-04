package com.tyss.javaprogram.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "Dinesh";
		s1.percentage = 66.14;

		Student s2 = new Student();
		s2.id = 2;
		s2.name = "Ramesh";
		s2.percentage = 67.14;

		Student s3 = new Student();
		s3.id = 2;
		s3.name = "Ramesh";
		s3.percentage = 67.14;

		ArrayList<Student> ar = new ArrayList<>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);

		for (Student student : ar) {
			log.info("" + student.name);
			log.info("" + student.id);
			log.info("" + student.percentage);
		}

	}// end of method
}// end of class
