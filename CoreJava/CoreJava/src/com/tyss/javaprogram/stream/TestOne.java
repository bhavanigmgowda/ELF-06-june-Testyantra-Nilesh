package com.tyss.javaprogram.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TestOne {
   public static void main(String[] args) {
	
	  ArrayList<Integer> lst=new ArrayList<>();
	  lst.add(54);
	  lst.add(21);
	  lst.add(41);
	  lst.add(7);
	  
	  Comparator<Integer> c=(i,j)->i.compareTo(j);
	  
	List<Integer> sort=lst.stream().sorted().collect(Collectors.toList());
	    
	Integer i= lst.stream().min(c).get();
	
	
	
	log.info(""+i);
}
}
