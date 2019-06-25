package com.tyss.javaprogram.predicate;

import java.util.function.Consumer;

import lombok.extern.java.Log;

/**
 * Consumer Interface
 */
@Log
public class ConsumeDemo {
	public static void main(String[] args) {
		Student s1 = new Student("soma", 20, 35, 42);

		Consumer<Student> c = s -> { // passing parameter of student
			double d = (s.m1 + s.m2 + s.m3) / 3.0;
			log.info("" + s.name + " " + d);

		};

		c.accept(s1);

	} // end of method
}// end of class
