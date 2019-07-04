package com.tyss.javaprogram.collection;

import java.util.ArrayList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class ArrayListItratorGeneric {

	public static void main(String[] args) {

		ArrayList<Double> arr = new ArrayList<>();
		arr.add(50.20);
		arr.add(999.00);

		log.info("======================");

		ListIterator<Double> it = arr.listIterator(arr.size());

		while (it.hasPrevious()) {
			Double type = it.previous();

			log.info("" + type);
		}
	}// end of method

}// end of class
