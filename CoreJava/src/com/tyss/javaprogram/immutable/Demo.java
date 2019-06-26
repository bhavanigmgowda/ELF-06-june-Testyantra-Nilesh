package com.tyss.javaprogram.immutable;

import lombok.extern.java.Log;

@Log
public class Demo {

	public static void main(String[] args) {
		Person p = new Person("ronak", 54);
		log.info("" + p.getName() + " " + p.getAge());

	}
}
