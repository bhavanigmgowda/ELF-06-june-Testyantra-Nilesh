package com.tyss.javaprogram.objectclass;

public class DemoChips {
     public static void main(String[] args) {
		 
    	 Chips c=new Lays(); // upcast
		 Lays l=(Lays)c;  // downcast
		 l.open();
		 l.eat();
		 
		 
		 Chips t=new Bingo();
		 Bingo b=(Bingo)t;
		 b.open();
		 b.byteBingo();
	}
}
