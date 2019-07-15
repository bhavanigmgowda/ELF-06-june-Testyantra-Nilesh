package com.tyss.javaprogram.assesment;
/**
 * 	WAP to print sound of an animal based on the object received by the method
 * @author Administrator
 *
 */
public class AnimalTest {

	public static void main(String[] args) {
		Animal a = new Cat();
		IdentifySound is = new IdentifySound();
		is.identify(a);

	}// end of main

}// end of class
