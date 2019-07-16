package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.MessageBean;

import lombok.extern.java.Log;
@Log
public class MessageBeanTest {
	
	   public static void main(String[] args) {
		
		   
		   ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		   MessageBean bean=(MessageBean) applicationContext.getBean("messageBean");
		   log.info(" "+bean.getMessage());
		   
	}

}
