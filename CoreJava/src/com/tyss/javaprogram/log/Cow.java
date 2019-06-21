package com.tyss.javaprogram.log;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cow extends Animal {
	 private static final Logger log=Logger.getLogger("animalLoger");
      @Override
    void sound() {
         log.log(Level.SEVERE,"cow sound class");
      }
       
      
      @Override
    void div(int a, int b) {
    	// TODO Auto-generated method stub
    	super.div(a, b);
    }
}
