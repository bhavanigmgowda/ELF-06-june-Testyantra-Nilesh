package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.bean.Dell;
import com.tyss.springcore.bean.HardDisk;
import com.tyss.springcore.interfacee.Laptop;
import com.tyss.springcore.interfacee.StorageDevice;

@Configuration
public class LaptopConfig {
	@Bean
	public Laptop getLaptop() {
		return new Dell();
	}

	@Bean
	public StorageDevice getStorageDevice() {
		return new HardDisk();
	}

}
