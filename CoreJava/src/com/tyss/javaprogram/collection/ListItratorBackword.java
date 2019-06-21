package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItratorBackword {
	
	public static void main(String[] args) {
		  
		  ArrayList al=new ArrayList();
		  al.add(15);
		  al.add(52.2);
		  al.add('A');
		  al.add("ronak");
		  al.add("abc");
		  al.add("78");
		  
		ListIterator it=al.listIterator(al.size());
		while(it.hasPrevious())
		{
		Object obj=it.previous();
		  System.out.println(obj);
		}
	}

}
