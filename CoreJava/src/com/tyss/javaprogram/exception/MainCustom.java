package com.tyss.javaprogram.exception;
import lombok.extern.java.Log;

@Log
public class MainCustom {
   public static void main(String[] args) {
	    Word w=new Word();
	    try {
			w.validate();
		} catch (Exception e) {
			log.severe(""+e);
		}
}
}
