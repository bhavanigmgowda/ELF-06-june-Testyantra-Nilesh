package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListItrator {
	
	public static void main(String[] args) {
		  
		  ArrayList al=new ArrayList();
		  al.add(15);
		  al.add(52.2);
		  al.add('A');
		  al.add("ronak");
		  al.add("abc");
		  al.add("78");
		  
		Iterator it=al.iterator();
		
		 
		
		while(it.hasNext())
		{
			Object obj=it.next();
			
			System.out.println(obj);
		}
		  
	}

}
