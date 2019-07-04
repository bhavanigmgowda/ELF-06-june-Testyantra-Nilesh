package com.tyss.javaprogram.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add("ABC");
		h.add(25);
		h.add(20.54);
		h.add('a');
		
		for (Object object : h) {
			System.out.println(object+" ");
		}
		
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(" "+obj);
		}
		
		

	}

}
