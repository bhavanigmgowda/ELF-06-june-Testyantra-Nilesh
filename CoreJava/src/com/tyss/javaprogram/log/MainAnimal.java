package com.tyss.javaprogram.log;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MainAnimal {
	  private static final Logger log=Logger.getLogger("animalLoger");
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		log.setLevel(Level.ALL);
		
		try {
			FileHandler fh=new FileHandler("Animal.log",true);
			fh.setLevel(Level.CONFIG);
			fh.setFormatter(new SimpleFormatter());
			
			log.addHandler(fh);  // add handler
			
			Animal a=new Animal();
			a.sound();
			
			Animal b=new Cow();
			b.div(5,20);
			
			Animal c=new Lion();
			
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
