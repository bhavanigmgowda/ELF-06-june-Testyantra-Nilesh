package com.tyss.javaprogram.proprties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestAWriteProperties {
          public static void main(String[] args) {
			
        	  
        	  FileOutputStream fos;
			try {
				fos = new FileOutputStream("demo.properties");
				  
	        	  Properties p=new Properties();
	        	  p.setProperty("Company","Testyantra");
	         	  p.setProperty("Address","Basavangudi");
	            log.info("file created");       	 
				   try {
					p.store(fos,"company detail");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
        
        	 
        	  
		} 
}
