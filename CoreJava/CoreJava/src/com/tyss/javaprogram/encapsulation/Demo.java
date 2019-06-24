package com.tyss.javaprogram.encapsulation;

public class Demo {
    public static void main(String[] args) {
		  Empolyee e=new Empolyee();
		  e.setName("Mahesh");
		  e.setGender('M');
		  e.setAge(26);
		  DataBase1 d=new DataBase1();
		  d.getInfo(e);
		  DataBase2 d2=new DataBase2();
		  d2.getInfo(e);
	}
}
