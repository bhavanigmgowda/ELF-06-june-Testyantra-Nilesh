package com.tyss.javaprogram.log;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Product {
	 private static final Logger loger=Logger.getLogger("BuyProduct");
	 
	void buy()
      {
		 loger.log(Level.SEVERE,"this is sever from buy"); 
		  loger.log(Level.CONFIG,"this is config msg from buy"); 
		  System.out.println("done");
      }
}
