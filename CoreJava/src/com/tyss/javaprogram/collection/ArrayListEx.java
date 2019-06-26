package com.tyss.javaprogram.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListEx {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(52.2);
		al.add('A');
		al.add("ronak");
		al.add("abc");
		al.add("78");

		for (int i = 0; i < al.size(); i++) {  // fetching the value from arraylist
			Object obj = al.get(i);

			log.info("" + obj);

		}

	}// end of method
}// end of class
