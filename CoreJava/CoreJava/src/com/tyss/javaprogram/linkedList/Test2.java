package com.tyss.javaprogram.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test2 {

	 public static void main(String[] args) {
			
	    	LinkedList<Character> lst=new LinkedList<Character>();
	    	lst.add('a');
	    	lst.add('b');
	    	lst.add('c');
	    	lst.add('d');
	    	
	    	System.out.println(lst);
	    	System.out.println("=====");
	    	
	    	for (int i = 0; i <lst.size(); i++) {
				Object obj=lst.get(i);
				
				System.out.print(obj+" ");
			}
	    	
	    	System.out.println();
	    	
	    	for (Object object : lst) {
				System.out.print(object+" ");
			}
	    	
	    	System.out.println();
	    	Iterator<Character> it=lst.iterator();
	    	while(it.hasNext())
	    	{
	    		Character obj=it.next();
	    		
	    		System.out.print(" "+obj);
	    	}
	    	
	    	System.out.println();
	    	ListIterator<Character> lit=lst.listIterator();
	    	while(lit.hasNext())
	    	{
	           System.out.print(lit.next()+" ");   
	           
	    	}
	    	System.out.println();
	    	System.out.println("Backword");
	    	
	    	while(lit.hasPrevious())
	    	{
	           System.out.print(lit.previous()+" ");    		
	    	}
	    	
	    	
	    	
	    	
}
}
