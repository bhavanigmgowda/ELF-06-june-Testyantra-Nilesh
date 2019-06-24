package com.tyss.javaprogram.linkedList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class VectorGenric {
    public static void main(String[] args) {
    	
    	Vector<Character> vec=new Vector<Character>();
    	vec.add('a');
    	vec.add('b');
    	vec.add('c');
    	vec.add('d');
    	
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
    	Iterator<Character> it=vec.iterator();
    	while(it.hasNext())
    	{
    		Character obj=it.next();
    		
    		System.out.print(" "+obj);
    	}
    	
    	System.out.println();
    	ListIterator<Character> lit=vec.listIterator();
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
    	
    	Enumeration<Character> em=vec.elements();
    	  while(em.hasMoreElements())
    	  {
    		  Character c=em.nextElement();
    		  System.out.print(c+" ");
    	  }
    	
		
	}
}
