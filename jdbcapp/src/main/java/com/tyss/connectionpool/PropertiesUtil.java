package com.tyss.connectionpool;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil {

	private static PropertiesUtil propertiesutil = null;
	 Properties properties = null;

	private PropertiesUtil() throws Exception {
		properties = new Properties();
		properties.load(new FileInputStream("ConnectionPool.properties"));
	}

	public static PropertiesUtil getProperties() throws Exception {
		if (propertiesutil == null) {
			propertiesutil = new PropertiesUtil();
		}
		return propertiesutil;
	}

	public  String getProperty(String key) {
		return properties.getProperty(key);
	}

}
