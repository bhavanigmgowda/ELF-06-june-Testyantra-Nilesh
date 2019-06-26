package com.tyss.javaprogram.arrayprogram;

import lombok.extern.java.Log;

@Log
public class ForEachEx {
   public static void main(String[] args) {
	 int a[]= {5,4,1,2,3};
	 double b[]= {5.0,5.5,6.5};
	 for (int i : a) {
		 log.info(""+i);
	}
	   log.info("\n");
	 for (double d : b) {
		 log.info(""+d);
	}
}
}
