package com.tyss.javaprogram.jspaider;

public class CardDemo {
    public static void main(String[] args) {
		Card j=new Card();
		j.swipe();
		j.swipe();
		j.swipe();
		
		Card a=new Card();
		a.swipe();
		
		System.out.println("java Count is "+j.count);
		System.out.println("angular count is "+a.count);
		System.out.println("Organization count "+Card.orgCount);
	}
}
