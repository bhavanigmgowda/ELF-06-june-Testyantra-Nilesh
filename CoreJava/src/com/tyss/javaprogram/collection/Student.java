package com.tyss.javaprogram.collection;

public class Student implements Comparable<Student>  {
     public static double PER;
	public String name;
     int id;
     double percentage;
	/* 
	 * logic to sort student wrt to per   */
	/*public int compareTo(Student o) {
		
		if(this.percentage<o.percentage)
		{
			return -1;
		}
		else if(this.percentage>o.percentage)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}*/
     
	/*   logic to sort student wrt to id 
	 * 
	 * @Override public int compareTo(Student o) {
	 * 
	 * 
	 * if(this.id<o.id) { return -1; } else if(this.id>o.id) { return 1; } else {
	 * return 0; } }
	 */
     
     
     @Override
 	public int compareTo(Student o) {
		  String a=this.name;
		  String b=o.name;

    	 return a.compareTo(b);
 		
 		    
 			
 		}		
 	
     
     
	}
	
     
     

