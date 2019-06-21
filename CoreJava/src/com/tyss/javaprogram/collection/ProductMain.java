package com.tyss.javaprogram.collection;

import java.util.TreeSet;

public class ProductMain {
	
	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.name="soap";
		p1.cost=50;
		p1.rating=2.9;
		
		Product p2=new Product();
		p2.name="shampoo";
		p2.cost=200;
		p2.rating=4.5;
		
		Product p3=new Product();
		p3.name="Washing powder";
		p3.cost=150;
		p3.rating=3.8;
		
		Product p4=new Product();
		p4.name="coffee";
		p4.cost=75;
		p4.rating=5.0;
		
		
		TreeSet<Product> ts=new TreeSet<Product>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		for (Product product : ts) 
		{
			System.out.println("name ="+product.name);
			System.out.println("cost ="+product.cost);
			System.out.println("rating ="+product.rating);
		}
		
	}

}
