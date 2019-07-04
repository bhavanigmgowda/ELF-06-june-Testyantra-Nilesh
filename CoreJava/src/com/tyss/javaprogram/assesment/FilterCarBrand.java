package com.tyss.javaprogram.assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class FilterCarBrand {
   public static void main(String[] args) {
	
	   String brand="Toyota";
	   
	   ArrayList<Car> arrayList=new ArrayList<Car>();
	   arrayList.add(new Car("Innnova","Toyota",900000));
	   arrayList.add(new Car("Ertiga","Maruti",700000));
	   arrayList.add(new Car("Elantra","Hyundai",700000));
	   arrayList.add(new Car("etios","Toyota",900000));
	   List<Car> carbrand=arrayList.stream().filter(i->i.brand.equals(brand)).collect(Collectors.toList());
	   
	   
	   carbrand.forEach(i->log.info(i.name+" "+i.brand+" "));
	   
}
}
