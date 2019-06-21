package com.tyss.javapogram.array;

public class Array3 {
   public static void main(String[] args) {
	   int a[]= {5,6,2,1,4};
       int b[]= {30,40,50,60,70,80};	
       
      // System.arraycopy(src, srcPos, dest, destPos, length);
       System.arraycopy(a,2,b,2,3);
       for (int i : b) {
		System.out.print(i+" ");
	}
}
} 
