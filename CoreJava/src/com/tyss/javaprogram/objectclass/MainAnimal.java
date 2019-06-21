package com.tyss.javaprogram.objectclass;

public class MainAnimal {
      public static void main(String[] args) {
		    
    	  Animal a=new Cow(); // upcating
    	  Cow c=(Cow)a;
    	  
    	  c.a=10;
    	  c.b=20;
    	  c.eat();
    	  c.run();
	}
}
