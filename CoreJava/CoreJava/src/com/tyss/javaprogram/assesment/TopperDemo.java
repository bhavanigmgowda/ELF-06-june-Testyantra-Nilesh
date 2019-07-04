package com.tyss.javaprogram.assesment;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TopperDemo {
  public static void main(String[] args) {
	  
	  ArrayList<Student> arrayList=new ArrayList<>();
	  
	  arrayList.add(new Student("Mahesh","M",50));
	  arrayList.add(new Student("Ramesh","M", 30));
	  arrayList.add(new Student("kriti","F", 60));
	  arrayList.add(new Student("Pooja","F", 25));
	  
	  
		   Predicate<Student> s=(i)->{
			   if(i.gender=="F" )
			   {
				   return true;
			   }
			   else
			   {
				  return false;
			   }
		   };
	  
	    List<Student> passedStudent=arrayList.stream().filter(s).collect(Collectors.toList());
	  
	// List<Student> student=arrayList.stream().sorted(comparator).collect(Collectors.toList());
	 //     Student d2=student.stream().max(comparator);
	//  Student student=arrayList.stream().max(comparator);
	  
	  
	    for (Student student : passedStudent) {
			System.out.println(student);
		}
	  
	  
}
}

