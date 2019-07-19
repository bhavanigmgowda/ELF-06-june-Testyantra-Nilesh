package com.tyss.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.tyss.springcore.Interface.Animal;

public class Pet {
	
	String name;
	@Autowired
	//@Qualifier("Monkey")
	Animal animal;
	
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	// method
	
	public void doSometing()
	{
		animal.eat();
		animal.makeSound();
	}
	
	

}
