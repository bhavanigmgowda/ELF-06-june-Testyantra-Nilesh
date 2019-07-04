package com.tyss.javaprogram.immutable;
/**
 *   singleton
 */
public class Marker {
	private final static Marker m = new Marker(); // object

	private Marker() // contructor
	{

	}

	public static Marker getMarker() // getter method
	{
		return m;
	}

}
