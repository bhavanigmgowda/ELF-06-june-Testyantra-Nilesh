package com.tyss.javaprogram.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {
		
    	LinkedList lst=new LinkedList();
    	lst.add("dfsdjf");
    	lst.add(50);
    	lst.add(50.21);
    	lst.add('A');
    	
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
    	Iterator it=lst.iterator();
    	while(it.hasNext())
    	{
    		Object obj=it.next();
    		
    		System.out.print(" "+obj);
    	}
    	
    	System.out.println();
    	ListIterator lit=lst.listIterator();
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
