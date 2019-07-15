package com.tyss.javaprogram.assesment;


public final class Person {
    private  final String name;
    private  final int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
    
   public String getName()
   {
	   return this.name;
   }
   
   public int getAge()
   {
	   return this.age;
   }
}
