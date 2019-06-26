package com.tyss.javaprogram.implementinglamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
/**
 *  stream-map demo
 *  multiply array by 2 
 * @author Administrator
 *
 */
@Log
public class MapStream {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(6);
		lst.add(3);
		lst.add(8);

		List<Integer> x = lst.stream().map(i -> i * 2).collect(Collectors.toList());
		log.info("" + x);

	}// end of method

}// end of class
