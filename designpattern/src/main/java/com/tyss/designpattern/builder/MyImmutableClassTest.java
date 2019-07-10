package com.tyss.designpattern.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
 
	public static void main(String[] args) throws ParseException {
		MyImmutableClass immutableClass=new MyImmutableClass("Ronak",17,99857452104l);
	    log.info("name"+immutableClass.getName());
	    log.info("name"+immutableClass.getAge());
	    log.info("name"+immutableClass.getPhone());
	   
		log.info("===============");
		
	    SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
	     Date date=format.parse("2017-01-05");
	   
	   /* EmployeeData data=new EmployeeData(1,"Virat",22,
	    		"Male", 22500,9887744556l,"v@gmail.com",
	    		"Tester",date,46545454l,date,6,5);
*/
	    
	    
		/*
		 * EmployeeData2 data2=new EmployeeData2 .EmployeeDataBuilder() .id(123)
		 * .name("Sunny") .age(21) .gender("Male") .salary(454.00) .phone(45454)
		 * .joining_date(date) .account_no(4545456) .email("sunny@gmail")
		 * .designation("tester") .dob(date) .dept_ID(5) .manager_ID(6) .build();
		 */
	   // log.info(""+data2.toString());
	                          
	    
	    
	    EmployeeData3 data3=new EmployeeData3
                .EmployeeData3Builder()
                .id(123)
                .name("Sunny")
                .age(21)
                .gender("Male")
                .salary(454.00)
                .phone(45454)
                .joining_date(date)
                .account_no(4545456)
                .email("sunny@gmail")
                .designation("tester")
                .dob(date)
                .dept_ID(5)
                .manager_ID(6)
                .build();

log.info(""+data3.toString());
	    
	    
	                           
	                          
	    
	}// End Of main
}// End of Class
