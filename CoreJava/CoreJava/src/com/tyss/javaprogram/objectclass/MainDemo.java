package com.tyss.javaprogram.objectclass;

public class MainDemo {
	public static void main(String[] args) {
		Student s1=new Student("shubham",22,5.5);
		Student s2=new Student("shubham",22,5.5);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
