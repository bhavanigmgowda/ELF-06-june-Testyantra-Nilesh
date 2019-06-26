package com.tyss.javaprogram.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		al.add(15);
		al.add(52.2);
		al.add('A');
		al.add("ronak");
		al.add("abc");
		al.add("78");
		log.info("" + al);
	}// end of method
}// end of class
