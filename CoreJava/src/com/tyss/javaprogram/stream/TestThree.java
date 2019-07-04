package com.tyss.javaprogram.stream;

import java.util.stream.Stream;
/**
 *  no need to write lamda use println using method reference
 * @author Administrator
 *
 */


public class TestThree {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(5, 6, 4, 2);

		s.forEach(System.out::println); 
		
		
		
	}// end of method

}
