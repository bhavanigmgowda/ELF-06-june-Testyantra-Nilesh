package com.tyss.javaprogram.collection;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		  
		  ArrayList al=new ArrayList();
		  al.add(15);
		  al.add(52.2);
		  al.add('A');
		  al.add("ronak");
		  al.add("abc");
		  al.add("78");
		  
		  System.out.println(al);
		  for (Object object : al) {
			  System.out.print(object+" ");
		}
		  
	}

}
