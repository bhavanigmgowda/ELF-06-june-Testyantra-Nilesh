package com.tyss.springcore.usingAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.beans.MessageBean;

@Configuration
public class MessageConfig {

	@Bean
	@Scope("prototype")
	public MessageBean getMessageBean() {
		MessageBean bean = new MessageBean();
		bean.setMessage("Helloooooooooo.........!!!!!");
		

		return bean;
	}

}
