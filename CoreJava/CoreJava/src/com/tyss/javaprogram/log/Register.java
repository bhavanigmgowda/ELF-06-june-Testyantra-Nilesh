package com.tyss.javaprogram.log;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	 private static final Logger loger=Logger.getLogger("Amazon");
   void connectedDb()
   {
	   loger.log(Level.SEVERE,"this is severe msg from db");
	   loger.log(Level.FINE,"this is fine msg from connected");
   }
   
   void Store()
   {
	   loger.log(Level.WARNING,"data  is not store");
   }
}
