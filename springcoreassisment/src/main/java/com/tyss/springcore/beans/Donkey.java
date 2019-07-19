package com.tyss.springcore.beans;

import com.tyss.springcore.Interface.Animal;

import lombok.extern.java.Log;
@Log
public class Donkey implements Animal {

	@Override
	public void eat() {
	  log.info("Grass");	
	}

	@Override
	public void makeSound() {
		  log.info("dhechu......");	
	}

}
