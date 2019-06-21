package com.tyss.programfile.inheritance;

public class Pen {
       int cost;
       void write()
       {
    	   System.out.println("parent class method write");
       }
}

  class Marker extends Pen
  {
    	 void color()
    	 {
    		  System.out.println("child  class method"); 
    	 }
    	 
  }
