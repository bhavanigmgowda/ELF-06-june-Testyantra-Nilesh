package com.tyss.springcore;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.Interface.Animal;
import com.tyss.springcore.beans.Pet;
import com.tyss.springcore.usingAnnotation.PetConfig;

import lombok.extern.java.Log;
@Log
public class PetTest {
	
	 public static void main(String[] args) {
		
		 ApplicationContext context=new AnnotationConfigApplicationContext(PetConfig.class);
		 Pet p= context.getBean(Pet.class);
		 
		   p.doSometing();
		 
	}// end of method

} // end of class
