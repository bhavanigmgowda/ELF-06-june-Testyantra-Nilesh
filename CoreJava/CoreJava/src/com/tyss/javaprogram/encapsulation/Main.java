package com.tyss.javaprogram.encapsulation;

public class Main {
         public static void main(String[] args) {
			Person p=new Person();
			p.setName("monish");
			p.setAge(72);
			Db1 d=new Db1();
			d.data(p);
			
			Db2 d2=new Db2();
			d2.data(p);
		}
}
