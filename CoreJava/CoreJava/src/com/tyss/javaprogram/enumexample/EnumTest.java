package com.tyss.javaprogram.enumexample;
import lombok.extern.java.Log;

@Log
public class EnumTest {
    public static void main(String[] args) {
		log.info(""+Gender.MALE);
		log.info(""+Gender.FEMALE.ordinal()); // return index ordinal 
		
		Gender t=Gender.FEMALE;
		
		
		switch (t) {
		case MALE:
			log.info("It is male");
			break;

		case FEMALE:
			log.info("it is female");
			break;
		
		 case OTHER:
		  log.info("it is other");
		 break;
		}
		
		
	}
}
