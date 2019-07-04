package com.tyss.javaprogram.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;

/**
 * Stream with group of object
 * 
 * @author Administrator
 *
 */

@Log
public class StreamGroupObj {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(5, 6, 4, 2);

		s.forEach(i -> log.info("" + i));
	}// end of method

}// end of class
