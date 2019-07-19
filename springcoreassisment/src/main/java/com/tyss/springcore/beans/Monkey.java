package com.tyss.springcore.beans;

import com.tyss.springcore.Interface.Animal;

import lombok.extern.java.Log;
@Log
public class Monkey implements Animal {

	@Override
	public void eat() {
		 log.info("Banana");	
	}

	@Override
	public void makeSound() {
		  log.info("monkey sound ......");	
	}

}
