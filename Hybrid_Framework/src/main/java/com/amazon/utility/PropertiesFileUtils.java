package com.amazon.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.amazon.commondata.CommonData;

public class PropertiesFileUtils {
	
	public static String getValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream(CommonData.configFilePath);
		Properties properties=new Properties();
		properties.load(fis);
		return properties.getProperty(key); 
	}

}
