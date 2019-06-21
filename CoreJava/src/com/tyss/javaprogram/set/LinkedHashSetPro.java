package com.tyss.javaprogram.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPro {
	
    public static void main(String[] args) {
		
		LinkedHashSet h=new LinkedHashSet();
		h.add("ABC");
		h.add(25);
		h.add(254.00);
		h.add('D');
		
		
		for (Object object : h) {
			System.out.println(object+" ");
		}
		 System.out.println("itrator");
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(" "+obj);
		}
		
		

	}
}


