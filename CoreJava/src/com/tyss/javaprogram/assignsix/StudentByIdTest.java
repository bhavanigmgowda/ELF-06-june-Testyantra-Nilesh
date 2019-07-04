package com.tyss.javaprogram.assignsix;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class StudentByIdTest {
     public static void main(String[] args) {
		
    	 StudentInfo s=new StudentInfo("yash",'M',1);
    	 StudentInfo sf = new StudentInfo("Gurpreet", 'M',3);
 		StudentInfo sf1 = new StudentInfo("Shubham", 'M',2);
 		
 		
 		ArrayList<StudentInfo> al = new ArrayList<>();
 		al.add(s);
 		al.add(sf);
 		al.add(sf1);
 	  
 		Comparator<StudentInfo> c=(i,j)->{
 			Integer n=i.id;
 			Integer m=i.id;
 			  return n.compareTo(m)*(-1);
 			   
 			 /*if(i.id>j.id)
 			 {
 				 return 1;
 			 }
 			 else if(i.id<j.id)
 			 {
 				 return -1;
 			 }
 			 else
 			 {
 				 return 0;
 			 }*/
 		};
 		
 	List<StudentInfo> si=al.stream().sorted(c).collect(Collectors.toList());
 	
 	  si.forEach(i->log.info(""+i.id+" "+i.name));
 		
	}
}
