package com.tyss.javaprogram.assesment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TopperMain {

	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<>();

		arrayList.add(new Student("Mahesh", "M", 100.00));
		arrayList.add(new Student("kriti", "M", 492.00));
		arrayList.add(new Student("Pooja", "M", 498.00));
		arrayList.add(new Student("Rajesh", "M", 200.00));

		Predicate<Student> male = (i) -> {
			if (i.gender =="M") {
				return true;
			} else {
				return false;
			}
		};
		
		Predicate<Student> female = (i) -> {
			if (i.gender == "F") {
				return true;
			} else {
				return false;
			}
		};
		
		Comparator<Student> compare=(i,j)->{
			 if(i.ttlmarks>j.ttlmarks )
			 {
				 return 1;
			 }
			 else if(i.ttlmarks<j.ttlmarks)
			 {
				 return -1;
			 }
			 else
			 {
				 return 0;
			 }
			
		};
		
		
		List<Student> boy=arrayList.stream().filter(male).collect(Collectors.toList());
		Student topper1=boy.stream().max(compare).get();
		log.info(""+topper1);
		 
	  //  Student girl=arrayList.stream().filter(female).max(compare).get(); 
	//	 log.info(""+girl); 
		
	log.info(""+boy);
	}

}

