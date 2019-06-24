package com.tyss.javaprogram.immutable;

import lombok.extern.java.Log;

@Log
public class Demo1 {
	public static void main(String[] args) {
		Marker a = Marker.getMarker();
		Marker b = Marker.getMarker();

		log.info("" + a);
		log.info("" + b);
	}
}
