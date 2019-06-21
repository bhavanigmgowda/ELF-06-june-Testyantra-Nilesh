package com.tyss.javaprogram.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetEx {
	 public static void main(String[] args) {
			
			TreeSet h=new TreeSet();
			h.add(1);
			h.add(25);
			h.add(21);
			h.add(54);
			//h.add(null);
			
			
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
