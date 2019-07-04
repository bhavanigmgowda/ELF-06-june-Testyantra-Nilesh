package com.tyss.javaprogram.implementinglamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TestFour {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(7);
		lst.add(4);
		lst.add(8);

	   Comparator<Integer> c=(i,j)->i.compareTo(j)*-1;	  
		
	     List<Integer> x= lst.stream().sorted(c).collect(Collectors.toList());
         
		  lst.stream().forEach(i->log.info(""+i));
		 
		  log.info("===============================");
		  
		   x.forEach(i->log.info(""+i));

	}

}
