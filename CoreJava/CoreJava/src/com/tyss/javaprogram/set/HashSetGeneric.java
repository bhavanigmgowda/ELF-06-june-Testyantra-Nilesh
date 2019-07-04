package com.tyss.javaprogram.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetGeneric {

public static void main(String[] args) {
		
		HashSet<String> h=new HashSet<String>();
		h.add("ABC");
		h.add("25");
		h.add("dsf");
		h.add("Dev");
		h.add(null);
		h.add(null);
		h.add(null);
		h.add("25");
		h.add("dsf");
		h.add("Dev");
		
		
		for (String object : h) {
			System.out.println(object+" ");
		}
		 System.out.println("itrator");
		Iterator<String> itr=h.iterator();
		while(itr.hasNext())
		{
			String obj=itr.next();
			System.out.println(" "+obj);
		}
		
		

	}
}
