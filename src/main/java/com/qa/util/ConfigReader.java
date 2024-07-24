package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	/**
	 * 
	 * @return loaded Properties 
	 */
	
	public Properties init_prop() {
		
		prop= new Properties();
		try {
			FileInputStream ip= new FileInputStream("./scr/test/resources/config/config.properties");
			
				prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		return prop;
	}
	
	}


