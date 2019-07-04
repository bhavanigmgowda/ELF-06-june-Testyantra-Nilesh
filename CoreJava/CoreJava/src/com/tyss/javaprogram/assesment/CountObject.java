package com.tyss.javaprogram.assesment;

import java.util.ArrayList;
import java.util.logging.Logger;

public class CountObject {
	
  private static Logger log=Logger.getLogger("couunt");
   static int dogCount=0;
   static int cowCount=0;
   static int lionCount=0;
	 
     public static void main(String[] args) {
		
    	 ArrayList<Object> list=new ArrayList<>();
    	 list.add(new Cow());
    	 list.add(new Cow());
    	 list.add(new Cow());
    	 list.add(new Cow());
    	 list.add(new Cow());
    	 list.add(new Cow());
    	 list.add(new Cow());
    	 list.add(new Cow());
    	 list.add(new Cow());
    	 list.add(new Cow());
    	 list.add(new Dog());
    	 list.add(new Dog());
    	 list.add(new Dog());
    	 list.add(new Dog());
    	 list.add(new Dog());
    	 list.add(new Lion());
    	 list.add(new Lion());
    	 list.add(new Lion());
    	 list.add(new Lion());
    	 list.add(new Lion());
    	 
    	 
    	 list.forEach(i->{
    		 if(i instanceof Cow)
    		 {
    			 cowCount++;
    		 }
    		 else if(i instanceof Lion)
    		 {
    			 lionCount++;
    		 }
    		 else if(i instanceof Dog)
    		 {
    			 dogCount++;
    		 }
    	 });
    		 
    	 log.info(""+cowCount);
    	 log.info(""+dogCount);
    	 log.info(""+lionCount);
    	 
	}
}
