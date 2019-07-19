
package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.MessageBean;
import com.tyss.springcore.usingAnnotation.MessageConfig;

import lombok.extern.java.Log;
@Log
public class MessageAnnotationTest {
  
	   public static void main(String[] args) {
		
       ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MessageConfig.class);  
       MessageBean beanone =applicationContext.getBean(MessageBean.class);
       MessageBean beantwo =applicationContext.getBean(MessageBean.class);
       
       log.info(""+beanone.getMessage());
       log.info(""+beantwo.getMessage());
        
         
       beanone.setMessage("Hey...");
       beantwo.setMessage("bye...");
       log.info(""+beanone.getMessage());
       log.info(""+beantwo.getMessage());
        
        
       ((ConfigurableApplicationContext)applicationContext).registerShutdownHook();
     //  ((ConfigurableApplicationContext)applicationContext).close();
	}
}
