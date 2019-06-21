package com.tyss.programfile.inheritance;

public class Pen1 {
    void write()
    {
    	System.out.println("Write with pen ");
    }
}
   class Marker1 extends Pen1{
	     @Override
	    void write() 
	     {
	        System.out.println("write with Marker");
	    }
   }