package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Pet;
/**
 *     Merge Annotation and xml Configaration 
 * @author Administrator
 *
 */


public class PetTestOne {

	 public static void main(String[] args) {
		 
		 ApplicationContext context=new ClassPathXmlApplicationContext("pet.xml");
		 Pet pet= (Pet) context.getBean("pet");  // downcast
		 
		  pet.doSometing();
	}
}
