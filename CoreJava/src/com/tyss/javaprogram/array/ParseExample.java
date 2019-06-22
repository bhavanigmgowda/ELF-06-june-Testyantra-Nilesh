package com.tyss.javaprogram.array;

import lombok.extern.java.Log;

@Log
public class ParseExample {
          public static void main(String[] args) {
			 String a="40";
			 int no=Integer.parseInt(a);
			   log.info(""+no);
			 String b="true";
			 boolean res=Boolean.parseBoolean(b);
			 log.info(""+res);
			 
			 String d="54.20";
			 double e=Double.parseDouble(d);
			 log.info(""+e);
		}
}
