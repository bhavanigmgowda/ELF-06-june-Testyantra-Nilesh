package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import lombok.extern.java.Log;
@Log
public class Test2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		  
		  @SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();
		  al.add(15);
		  al.add(52.2);
		  al.add('A');
		  al.add("ronak");
		  al.add("abc");
		  al.add("78");
		  
		  log.info(""+al);
		  for (Object object : al) {
			  log.info(""+object+" ");
		}
		  
	}

}
