package com.tyss.javaprogram.log;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Amazon {
   private static final Logger loger=Logger.getLogger("Amazon");
	public static void main(String[] args) {
        LogManager.getLogManager().reset();
        loger.setLevel(Level.ALL);
        
        
        FileHandler fh;
		try {
			fh = new FileHandler("Amazon.log");
			 fh.setLevel(Level.SEVERE);
			 fh.setFormatter(new SimpleFormatter());
		     loger.addHandler(fh);
		     
		     Register r=new Register();
		       r.connectedDb();
		       r.Store();
		       System.out.println("done");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}

}
