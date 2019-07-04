package com.tyss.javaprogram.stream;

import java.util.ArrayList;
import java.util.Comparator;
/**
 *     max percentage using Stream 
 */
import lombok.extern.java.Log;

@Log
public class StudentDemo {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(1, "ronak", 50.54);
		Student s2 = new Student(2, "Ramesh", 60);
		Student s3 = new Student(3, "Suresh", 75);
		Student s4 = new Student(4, "Rajesh", 90);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
        
		
		Student s=Student.getTopper(al);
		 log.info(""+s.name+" got highest per "+s.per);
		 
		 Student low=Student.getlast(al);
		 log.info(""+low.name+" got lowesr percent "+low.per);

	} // end of method
}// end opf class
