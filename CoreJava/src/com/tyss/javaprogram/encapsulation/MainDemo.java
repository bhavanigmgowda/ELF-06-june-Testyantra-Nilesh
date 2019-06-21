package com.tyss.javaprogram.encapsulation;

import java.util.logging.Logger;
 
public class MainDemo {
	 public static final  Logger log=Logger.getLogger("employee");
     public static void main(String[] args) {
  	  // with lambok
	  Employee2 e2 =new Employee2();
	  e2.setId(1);
	  e2.setName("ronak");
	  e2.setAge(18);
	  e2.setGender('m');
	  
	  
	  
	  log.info("info emp1"+e2);
	  
	  //without lambok
	  Empolyee e=new Empolyee();
	  
	  log.info("info emp1"+e.toString());
	 
	}
}
