package com.tyss.javapogram.array;

import java.util.Arrays;

public class ArrayCopy {
   public static void main(String[] args) {
         int a[]= {5,6,2,1,4};
         int b[]= {30,40,50,60,70,80};
         
        int k=0;
         for (int i =2; i <=b.length-1; i++) 
         {
			b[i]=a[k++];
		 }
         
         for (int i : b) {
			System.out.println(i); 
		}
       
         
		
	
}
}
