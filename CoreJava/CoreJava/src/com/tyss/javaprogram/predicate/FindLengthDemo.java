package com.tyss.javaprogram.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class FindLengthDemo {
         public static void main(String[] args) {
			Predicate<String> l=(t)->t.length()>=5;
			boolean res=l.test("abcdee");
			log.info(""+res);
}
}
