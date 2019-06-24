package com.tyss.javaprogram.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
       public static void main(String[] args) {
	  // unorder result
    	   HashMap<String,Integer> hm=new HashMap<String, Integer>();
    	   hm.put("one",1);
    	   hm.put("Two",2);
    	   hm.put("Three",3);
    	   hm.put("four",4);
    	   for (Map.Entry<String,Integer> ent : hm.entrySet()) {
			  String key=ent.getKey();
			  Integer val=ent.getValue();
			  
			  System.out.println("Key "+key+ " val "+val);
		}
    	   System.out.println("====================");
    	   
    	   Set<String> ts=hm.keySet();
    	   for (String string : ts) {
			   System.out.print(" key ="+string);
		}
    	   System.out.println("==================");
    	   
    	   
    	  Collection<Integer> ci=hm.values();
    	  Iterator<Integer> it=ci.iterator();
    	  while(it.hasNext())
    	  {
    		  Integer r=it.next();
    		  System.out.println(r);
    	  }
    	   
	}
}
