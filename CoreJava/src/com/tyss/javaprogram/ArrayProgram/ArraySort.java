package com.tyss.javaprogram.ArrayProgram;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
         public static void main(String[] args) {
			
        	 Integer a[]= {5,3,2,1,4};
        	 
        	 
        	Arrays.sort(a);
        	Arrays.sort(a,Collections.reverseOrder());   
        	   for (int i : a) {
				System.out.print(i+" ");
			}
        	 
        	 
		}
}
