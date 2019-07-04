package com.tyss.javaprogram.assesment;

import java.util.function.Consumer;
import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class GetObject {
 
	Supplier<Pen> p=()->new Pen();
     
	Pen obj=p.get();
	
	Pen penone=new Pen("cello",10);
	
	Consumer<Pen> print=i->log.info(""+i.name+" "+i.price);
	
	
}



