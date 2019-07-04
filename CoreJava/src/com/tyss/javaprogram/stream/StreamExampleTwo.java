 package com.tyss.javaprogram.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class StreamExampleTwo {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(6);
		lst.add(3);
		lst.add(8);

		long x = lst.stream().filter(i -> i % 3 != 0).count();

		log.info("Number of object are " + x);

	}
}
