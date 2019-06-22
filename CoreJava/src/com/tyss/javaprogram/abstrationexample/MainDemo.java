package com.tyss.javaprogram.abstrationexample;


public class MainDemo {
     public static void main(String[] args) {
		  Icici i=new Icici();
		  Sbi s=new Sbi();
		  Machine m=new Machine();
		  m.slot(s);
		  
		  m.slot(i);
	}
}
