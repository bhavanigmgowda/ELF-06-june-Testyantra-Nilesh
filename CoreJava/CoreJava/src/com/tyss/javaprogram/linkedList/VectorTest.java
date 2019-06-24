package com.tyss.javaprogram.linkedList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
		  Vector vec=new Vector();
		  vec.add("ABC");
	    	vec.add(70);
	    	vec.add(577.21);
	    	vec.add('B');
	    	
	    	System.out.println(vec);
	    	System.out.println("=====");
	    	
	    	for (int i = 0; i <vec.size(); i++) {
				Object obj=vec.get(i);
				
				System.out.print(obj+" ");
			}
	    	
	    	System.out.println();
	    	
	    	for (Object object : vec) {
				System.out.print(object+" ");
			}
	    
	    	System.out.println();
	    	Iterator it=vec.iterator();
	    	while(it.hasNext())
	    	{
	    		Object obj=it.next();
	    		
	    		System.out.print(" "+obj);
	    	}
	    	
	    	System.out.println();
	    	ListIterator lit=vec.listIterator();
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
	    	// enumeration
	    	System.out.println();
	    	System.out.println("enumeration");
	    	Enumeration em=vec.elements();
	    	  while(em.hasMoreElements())
	    	  {
	    		  Object c=em.nextElement();
	    		  System.out.print(c+" ");
	    	  }
	    	
	    	
		}
	}

