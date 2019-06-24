package com.tyss.javaprogram.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    
	public static void main(String[] args) {
		 // order result
		LinkedHashMap<Character,Double> lhm=new  LinkedHashMap<Character, Double>();
		lhm.put('A',54.21);
		lhm.put('B',5.2);
		lhm.put('C',95.00);
		lhm.put('D',85.287);
		
		
		for (Map.Entry<Character,Double> en :lhm.entrySet()) {
			Character key=en.getKey();
			Double val=en.getValue();
			
			System.out.println("key"+key+" val "+val);
		}
		
	}
}
