package com.tyss.javaprogram.exception;

public class MainCustom {
   public static void main(String[] args) {
	    Word w=new Word();
	    try {
			w.validate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
}
}
