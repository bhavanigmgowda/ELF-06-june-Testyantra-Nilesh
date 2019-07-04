package com.tyss.javaprogram.lamda;
  
  interface Sq
  {
	  
	  int square(int a);
  }

public class Square {
	public static void main(String[] args) {
	/* datatype is interface */	
		    Sq s=a->a*a;
		 
		    int no=s.square(5);
			    System.out.println(no);
		 
	}

}
