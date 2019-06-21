package com.tyss.javaprogram.ArrayProgram;

import java.util.Scanner;

public class SearchArray {
	 public static void main(String[] args) {
		 System.out.println("enter the element ");
		 Scanner scn=new Scanner(System.in);
		 int se=scn.nextInt();
		 int count=0;
		 int a[]= {5,3,2,1,4};
    	 
  	     for (int i = 0; i < a.length; i++) {
  	    	 if(a[i]==se)
  	    	 {
  	    	    	 count++;
  	    	    	 break;
  	    	 }
  	    	
  	    	 if(count>0)
  	    	 {
  	    		 System.out.println("elememt is present ");
  	    	 }
  	    	 else
  	    	 {
  	    		 System.out.println();
  	    	 }
			
		}
	}

}
