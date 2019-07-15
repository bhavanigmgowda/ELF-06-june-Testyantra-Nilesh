package com.tyss.javaprogram.assignmentone;

import lombok.extern.java.Log;

@Log
public class CheckPrime {
   public static void main(String[] args) {
	   int i;
           for(i =3; i <=100; i++) 
           {
			 for (int j =2; j <=i; j++) {
				if(i%j==0)
				{
					break;
				}
				else
				{
					log.info(""+i);
					break;
				}
				
			}
				
		} 	
  }
}
