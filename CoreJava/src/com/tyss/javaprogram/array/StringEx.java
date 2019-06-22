package com.tyss.javaprogram.array;

import lombok.extern.java.Log;

@Log
public class StringEx {
	public static void main(String[] args) {
		String name = "Dimple";
		int size = name.length(); // number of character present in string length()
		log.info("length is" + size);

	}
}
