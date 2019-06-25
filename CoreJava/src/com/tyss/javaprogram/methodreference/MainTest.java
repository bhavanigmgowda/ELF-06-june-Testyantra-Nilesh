package com.tyss.javaprogram.methodreference;

import lombok.extern.java.Log;

@Log
public class MainTest {
    public static void main(String[] args) {
	  
    	Demo1 d=new Demo1();
    	Avarage a=d::calculate;
    	double res=a.avg(10,20,30);
    	log.info(""+res);
	}
}
