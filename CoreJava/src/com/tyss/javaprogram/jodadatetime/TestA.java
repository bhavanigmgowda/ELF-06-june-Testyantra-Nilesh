package com.tyss.javaprogram.jodadatetime;

import java.time.LocalDate;

import lombok.extern.java.Log;
/**
 * joda package // time package
 * @author Administrator
 *
 */
@Log
public class TestA {
            public static void main(String[] args) {
	             LocalDate d=LocalDate.now();
	             log.info(""+LocalDate.now()); 
	          
	           log.info(""+  d.getDayOfMonth());  
	           log.info(""+  d.getDayOfYear());  //days pass in year
	           log.info(""+  d.getDayOfWeek());  // day
	           log.info(""+  d.getYear());  //year
	           
	           log.info(""+  d.plusDays(7));  
	           
	             	
			}
}
