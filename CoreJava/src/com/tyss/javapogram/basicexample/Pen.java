package com.tyss.javapogram.basicexample;

 class Pen {
      String clr;
      int cost;
        
      void write()
      {
    	  System.out.println("write something");
      }
      
       public static void main(String[] args) {
		  Pen p=new Pen();
		  p.clr="blue";
		  p.cost=100;
		  p.write();
	}
}
  
  
	       
  
