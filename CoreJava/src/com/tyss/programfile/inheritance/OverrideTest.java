package com.tyss.programfile.inheritance;

public class OverrideTest {
     public static void main(String[] args) {
		  Pen1 p=new Pen1();
		  p.write();
		  
		  Pen1 p1=new Marker1();
		  p1.write();
		  
		  Marker1 m=new Marker1();
		  m.write();
	}
}
