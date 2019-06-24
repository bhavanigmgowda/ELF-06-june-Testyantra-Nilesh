package com.tyss.javaprogram.log;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestFile {
	 private static final Logger loger=Logger.getLogger("BuyProduct");
    public static void main(String[] args) {
		 
    	LogManager.getLogManager().reset();
    	loger.setLevel(Level.ALL);// all logger files available
    	
    	
    	try {
			FileHandler fh=new FileHandler("buyproduct.log",true); // for override the log  file
			fh.setLevel(Level.SEVERE); //store only filter file
			fh.setFormatter(new SimpleFormatter()); // store file in simple format not in xml
			 loger.addHandler(fh);
			 
			 
			 loger.log(Level.SEVERE,"this is sever"); 
			  loger.log(Level.CONFIG,"this is config msg");
			  
			  Product p=new Product();
			  p.buy();
			 
			 
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
    	
	}
}
