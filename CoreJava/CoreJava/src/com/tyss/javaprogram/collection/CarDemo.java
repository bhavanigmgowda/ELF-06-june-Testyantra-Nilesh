package com.tyss.javaprogram.collection;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class CarDemo {
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "ertiga";
		c1.brand = "Maruti";
		c1.cost = 900000;
		c1.rating = 3.5;

		Car c2 = new Car();
		c2.name = "pajaro";
		c2.brand = "toyota";
		c2.cost = 210000;
		c2.rating = 4.2;

		Car c3 = new Car();
		c3.name = "i20";
		c3.brand = "Maruti";
		c3.cost = 400000;
		c3.rating = 2.5;

		TreeSet<Car> ts = new TreeSet<>();
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);

		for (Car car : ts) {
			log.info("name =" + car.name);
			log.info("brand =" + car.brand);
			log.info("cost =" + car.cost);
			log.info("rating =" + car.rating);

		}
	}
}
