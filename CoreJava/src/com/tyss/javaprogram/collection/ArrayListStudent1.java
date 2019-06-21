package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudent1 {
	public static void main(String[] args) {
	     Student s1=new  Student();
	     s1.id=1;
	     s1.name="Dinesh";
	     s1.percentage=66.14;
	     
	     Student s2=new  Student();
	     s2.id=2;
	     s2.name="Ramesh";
	     s2.percentage=77.14;
	     
	     Student s3=new  Student();
	     s3.id=3;
	     s3.name="Ramesh";
	     s3.percentage=54.14;
	     
	     
	     
	     ArrayList<Student> ar=new ArrayList<Student>();
	     ar.add(s1);
	     ar.add(s2);
	     ar.add(s3);
	     
	     Iterator<Student> it=ar.iterator();
	       while(it.hasNext())
	       {
	    	   Student s=it.next();
	    	   System.out.println(s.id);
	    	   System.out.println(s.name);
	    	   System.out.println(s.percentage);
	       }
	    	   
	     // list itrator
	       
	      ListIterator<Student> itr=ar.listIterator();
	      while(it.hasNext())
	      {
	    	  Student s=itr.next();
	    	  System.out.println(s.id);
	    	   System.out.println(s.name);
	    	   System.out.println(s.percentage);
	    	  
	      }
	}
}
