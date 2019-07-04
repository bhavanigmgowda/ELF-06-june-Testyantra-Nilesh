package com.tyss.javaprogram.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Student {
	int id;
	String name;
	double per;

	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}

	static Comparator<Student> c = (i, j) -> {   //  n logic
		if (i.per > j.per) {
			return 1;
		} else if (i.per < j.per) {
			return -1;
		} else {
			return 0;
		}

	};

	static Student getTopper(ArrayList<Student> al) {

		return al.stream().max(c).get();
	}

	static Student getlast(ArrayList<Student> al) {

		return al.stream().min(c).get();
	}
}
