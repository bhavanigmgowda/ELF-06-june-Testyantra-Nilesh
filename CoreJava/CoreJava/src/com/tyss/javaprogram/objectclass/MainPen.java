package com.tyss.javaprogram.objectclass;

public class MainPen {
     public static void main(String[] args) {
		   Pen p=new Marker();
		    
		   Marker m=(Marker)p;
		   m.cost=40;
		   m.size=4;
		   m.write();
		   m.color();
		   
	}
}
