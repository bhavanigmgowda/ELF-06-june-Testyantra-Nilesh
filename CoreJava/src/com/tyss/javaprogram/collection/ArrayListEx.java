package com.tyss.javaprogram.collection;

import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String[] args) {
	  
	  ArrayList al=new ArrayList();
	  al.add(15);
	  al.add(52.2);
	  al.add('A');
	  al.add("ronak");
	  al.add("abc");
	  al.add("78");
	
	  
	  for (int i = 0; i <al.size(); i++) 
	  {
		    Object obj =al.get(i);
		    
		    System.out.println(obj);
		
	}
	  
}
}
