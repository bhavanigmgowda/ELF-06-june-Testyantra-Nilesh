package com.tyss.javaprogram.assesment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByChoice {
  
	 public static void main(String[] args) {
	   ArrayList<Student> arraylist=new ArrayList<Student>();
	   arraylist.add(new Student(403,"RONAK",75.24));
	   arraylist.add(new Student(401,"Aman",68.74));
	   arraylist.add(new Student(402,"Kalpesh",88.58));
	   arraylist.add(new Student(404,"Jatin",76.47));
	   
	   Comparator<Student> compareByName=(i,j)->{
		   return i.name.compareTo(j.name);
	   };
	  
	   Comparator<Student> compareByROllNO=(i,j)->{
		   Integer rollone=i.rollNumber;
		   Integer rolltwo=j.rollNumber;
		   
		   return rollone.compareTo(rolltwo);
	   };
	  
	   Comparator<Student> compareByPercent=(i,j)->{
		   Double perone=i.percent;
		   Double pertwo=j.percent;
		   return perone.compareTo(pertwo);
	   };
	  
	   int choice=1;
	   
	   switch (choice) {
	case 1:
		sort(compareByName,arraylist);
		break;

      case 2:
    	  sort(compareByROllNO,arraylist);
		break;
      case 3:
    	  sort(compareByPercent,arraylist);
	  break;
	 default:
		break;
	}
	   
	  
	}
	 static void sort(Comparator<Student> ch,ArrayList<Student> arraylist)
	   {
		 List<Student> student= arraylist.stream().sorted(ch).collect(Collectors.toList());
		 student.forEach(System.out::println);
	   }
}

