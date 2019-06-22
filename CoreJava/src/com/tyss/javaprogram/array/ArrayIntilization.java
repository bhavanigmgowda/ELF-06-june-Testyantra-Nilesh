package com.tyss.javaprogram.array;

import lombok.extern.java.Log;

@Log
public class ArrayIntilization {
   public static void main(String[] args) {
	 int[] a= {1,2,3,4};
	 
	 for (int i = 0; i < a.length; i++) {
		log.info(""+a[i]);
	}
	 
	 
	 
	 for (int i = a.length-1; i>=0; i--) {
		log.info(""+a[i]);
	}
	 
	 char ch[]= {'a','b','c','d'};
	 for (int i = 0; i < ch.length; i++) {
		log.info(""+ch[i]);
	}
	 
	 String name[]= {"nil","ronak"};
	 for (int i = 0; i < name.length; i++) {
		log.info(""+name[i]);
	} 
}// end of method
}
