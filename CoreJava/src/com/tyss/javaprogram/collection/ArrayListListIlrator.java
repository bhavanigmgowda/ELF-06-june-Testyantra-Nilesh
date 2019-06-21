package com.tyss.javaprogram.collection;

import java.util.ArrayList;

import java.util.ListIterator;

public class ArrayListListIlrator {
	
	public static void main(String[] args) {
		  
		  ArrayList al=new ArrayList();
		  al.add(15);
		  al.add(52.2);
		  al.add('A');
		  al.add("ronak");
		  al.add("abc");
		  al.add("78");
		  
		ListIterator it=al.listIterator();
		
		 
		
		while(it.hasNext())
		{
			Object obj=it.next();
			
			System.out.println(obj);
		}
         System.out.println("==============");
             while(it.hasPrevious())
             {
            	 Object ob=it.previous();
            	 System.out.println(ob);
             }
}
}
