package com.tyss.javaprogram.ArrayProgram;

public class EqualArray {
   public static void main(String[] args) {
	   int a[]= {5,3,2,1,4};
	   int b[]= {5,3,2,1,7};
	   
	  boolean equal=true;
	   
	   if(a.length==b.length)
	   {
		   for (int i = 0; i < b.length; i++) 
		   {
			     if(a[i]==b[i])
			     {
			    	 equal=true;
			     }
		   }
		   System.out.println("array is equal");
	    }
	   else
	   {
		   System.out.println("not equal");
	   }
}
}
