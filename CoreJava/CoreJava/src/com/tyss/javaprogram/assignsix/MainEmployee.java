package com.tyss.javaprogram.assignsix;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class MainEmployee {
   public static void main(String[] args) {
	
	   ArrayList<Employee> al=new ArrayList<Employee>();
	   
	   Employee e1=new Employee("SoftwareEnginner",2.5);

	   Employee e2=new Employee("SoftwareEnginner",3);
	   Employee e3=new Employee("clerk",2);
	   
	   al.add(e1);
	   al.add(e2);
	   al.add(e3);
	   
	   
	 Predicate<Employee> p=i->{ 
		 if(i.exp>=2 && i.job=="SoftwareEnginner")
		 {
			 return true;
		 }
		 return false;
	 
	 };
	   
  List<Employee> lst=al.stream().filter(p).collect(Collectors.toList());
  
     lst.forEach(System.out::println);
	   
}
}

