package com.tyss.javaprogram.assignsix;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class MainDemo {
     public static void main(String[] args) {
		Student s1=new Student("ronak",50.54);
		Student s2=new Student("mahesh",30.54);
		Student s3=new Student("dinesh",80.00);
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		List<Student> lst=al.stream().filter(i->i.Per>=33).collect(Collectors.toList());
		    lst.forEach(i->log.info(""+i.name+" "+i.Per));
	}
}
