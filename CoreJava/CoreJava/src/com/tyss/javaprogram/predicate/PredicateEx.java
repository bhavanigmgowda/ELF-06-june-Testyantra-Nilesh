package com.tyss.javaprogram.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class PredicateEx {
	 public static void main(String[] args) {
	           Predicate<Integer> p=(t)->t%2==0;
	           boolean x=p.test(15);
	           log.info(""+x);
	}

}
