package com.tyss.javaprogram.hasareleation;

import lombok.extern.java.Log;

@Log
public class CarDemo {
    public static void main(String[] args) {
		Car c=new Car();
		c.m.play();
		log.info(""+c.price);
	}
}
