package com.tyss.springcore.usingAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.Interface.Animal;
import com.tyss.springcore.beans.Monkey;
import com.tyss.springcore.beans.Pet;

@Configuration
public class PetConfig {

	/*
	 * no need it configure in xml file 
	 * 
	 * @Bean public Pet getPet() { return new Pet(); }
	 * 
	 * @Bean(name="Monkey") public Animal getMonkey() { return new Monkey(); }
	 * 
	 * @Bean("Donkey") public Animal getDonkey() { return new Monkey(); }
	 */
}
