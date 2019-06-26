package com.tyss.javaprogram.collection;

public class Product implements Comparable<Product> {
	
	String name;
	int cost;
	double rating;
	@Override
	public int compareTo(Product o) {
		
		Double d=this.rating;
		Double b=o.rating;
		return d.compareTo(b)*(-1);
	}
	
	/*
	 * @Override public int compareTo(Product o) {
	 * 
	 * if (this.rating < o.rating) { return 1; } else if (this.rating > o.rating) {
	 * return -1; } else { return 0; } }
	 */

}
