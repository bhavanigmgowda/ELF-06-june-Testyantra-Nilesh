package com.tyss.javaprogram.assignsix;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MainTest {
	static Logger log = Logger.getLogger("Java");

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();

		Student s1 = new Student("nilesh", 50.00);
		Student s2 = new Student("Ronak", 30.24);
		Student s3 = new Student("ram", 44.45);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		List<Student> lst = al.stream().filter(i -> i.Per > 33).collect(Collectors.toList());
		System.out.println(lst);

	}
}
