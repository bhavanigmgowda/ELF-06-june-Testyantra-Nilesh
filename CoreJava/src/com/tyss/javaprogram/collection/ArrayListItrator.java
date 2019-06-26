package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class ArrayListItrator {

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

		@SuppressWarnings("rawtypes")
		Iterator it = al.iterator();

		while (it.hasNext()) {
			Object obj = it.next();

			log.info("" + obj);
		}

	}// end of method

}// end of class
