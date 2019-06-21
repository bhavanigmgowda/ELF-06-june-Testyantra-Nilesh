package com.tyss.javaprogram.log;
import java.io.Console;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestLogger {
	
	  private static final Logger loger=Logger.getLogger("Logger File");
     public static void main(String[] args) {
    	 
    	 
    	 LogManager.getLogManager().reset();
    	 loger.setLevel(Level.ALL);
    	 
    	 ConsoleHandler ch=new ConsoleHandler();
    	 ch.setLevel(Level.WARNING);
    	 loger.addHandler(ch);
    	 
    	 loger.log(Level.SEVERE,"this is SEVERE msg");
    	 loger.log(Level.WARNING, "this is WARNING msg");
    	 loger.log(Level.INFO, "this is INFO msg");
    	 loger.log(Level.CONFIG, "this is CONFIG msg");
    	 loger.log(Level.FINE, "this is FINE msg");
    	 loger.log(Level.FINER, "this is FINER msg");
    	 loger.log(Level.FINEST, "this is FINEST msg");
		 
	}
}
