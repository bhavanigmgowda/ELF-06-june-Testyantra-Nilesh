package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.bean.Dell;
import com.tyss.springcore.bean.Hp;
import com.tyss.springcore.config.LaptopConfig;

public class LaptopTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		Dell dell = context.getBean(Dell.class);

		dell.setBrand("Dell");
		dell.setColor("black");
		dell.setCost(2500.22);
		dell.setOs("Windows 10");
		dell.setRam(2);
		dell.setWeight(2.5);

		dell.showSpecificatiion();
	}

}
