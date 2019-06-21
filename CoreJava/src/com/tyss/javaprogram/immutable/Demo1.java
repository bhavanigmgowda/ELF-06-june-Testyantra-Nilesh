package com.tyss.javaprogram.immutable;

public class Demo1 {
     public static void main(String[] args) {
		Marker a=Marker.getMarker();
		Marker b=Marker.getMarker();
		
		System.out.println(a);
		System.out.println(b);
	}
}
