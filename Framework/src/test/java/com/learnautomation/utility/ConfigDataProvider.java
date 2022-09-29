package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {
		File src = new File("./config/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Unable to read properties file");
			e.printStackTrace();
		}
	}

	public String getDataFromConfig(String keyToSearch) {
		return pro.getProperty(keyToSearch);

	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}

	public String getUrl() {
		return pro.getProperty("qaURL");
	}
}
