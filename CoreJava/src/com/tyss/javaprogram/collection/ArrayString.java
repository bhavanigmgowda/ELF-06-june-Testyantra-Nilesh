package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayString {
   public static void main(String[] args) {
	
	   
	   ArrayList<String> al=new ArrayList<String>();
	    al.add("ABC");
	    al.add("DEF");
	    al.add("GHI");
	    al.add("JKL");
	    
	    
	    Iterator<String> itr=al.iterator();
	    while(itr.hasNext())
	    {
	    	String s=itr.next();
	    	System.out.println(s+" ");
	    			
	    }
	    
	    System.out.println("list itrator backword");
	    ListIterator<String> litr=al.listIterator(al.size());
	    
	    while(litr.hasPrevious())
	    {
	    	System.out.println(litr.previous());
	    }
	    
	    
	   
}
}
