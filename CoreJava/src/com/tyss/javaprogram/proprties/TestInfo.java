package com.tyss.javaprogram.proprties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestInfo {
	 public static void main(String[] args) {
			
   	  
   	  FileOutputStream fos;
		try {
			fos=new FileOutputStream("Information.properties");
			  
       	  Properties p=new Properties();
       	  p.setProperty("Name","Nilesh");
        	  p.setProperty("Address","Btm");
           log.info("file created");       	 
			   try {
				p.store(fos,"Info");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
   
}
}
