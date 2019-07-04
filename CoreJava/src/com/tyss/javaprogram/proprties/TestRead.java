package com.tyss.javaprogram.proprties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestRead {
	
	      public static void main(String[] args) {
	    	  FileInputStream fis=null;
	    	  try {
					fis=new FileInputStream("demo.properties");
					  
		       	  Properties p=new Properties();
		       	    	p.load(fis); 
		       	    	
		       	    String name=p.getProperty("Name");	
		       	    String ad=p.getProperty("Address");	
		       	    
		       	    log.info(""+name);
		       	    log.info(""+ad);
	
				}
	    	  catch (Exception e) {
	    		  
			}
		}
	 
			
	   
}
