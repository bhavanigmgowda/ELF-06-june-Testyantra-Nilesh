package com.tyss.javaprogram.collection;

import java.util.ArrayList;

import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class ArrayListListIlrator {

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
		ListIterator it = al.listIterator();

		while (it.hasNext()) {
			Object obj = it.next();

			log.info("" + obj);
		}
		log.info("==============");
		while (it.hasPrevious()) {
			Object ob = it.previous();
			log.info("" + ob);
		}
	}// end of method
}// end of class