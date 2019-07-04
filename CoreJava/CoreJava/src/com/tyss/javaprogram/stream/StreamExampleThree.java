package com.tyss.javaprogram.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class StreamExampleThree {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(7);
		lst.add(4);
		lst.add(8);

	     List<Integer> x= lst.stream().sorted().collect(Collectors.toList());
         
		log.info(""+ x);

	}
}
