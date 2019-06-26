package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import lombok.extern.java.Log;
@Log
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
	    	log.info(s+" ");
	    			
	    }
	    
	    log.info("list itrator backword");
	    ListIterator<String> litr=al.listIterator(al.size());
	    
	    while(litr.hasPrevious())
	    {
	    	log.info(litr.previous());
	    }
	    
	    
	   
}
}
