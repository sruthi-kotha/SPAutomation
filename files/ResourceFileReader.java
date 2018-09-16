package com.utilities.files;

import java.io.FileInputStream;
import java.util.Properties;

public class ResourceFileReader{

	protected String baseURL = null;
	protected String username = null;
	protected String password = null;
	protected String browser = null;
	protected String driverProperty = null;
	protected String driverPath = null;
	
	public  ResourceFileReader() {
		
		Properties urlProp = new Properties();
		
		try {
			urlProp.load(new FileInputStream("/Users/prashanthkumar/Education/corejava selenium/SimplePracticePOM/ConfigurationFiles/ResourceFile.properties"));
			baseURL = urlProp.getProperty("BaseURL");
			username = urlProp.getProperty("Username");
			password = urlProp.getProperty("Password");
			browser = urlProp.getProperty("Browser");
			driverProperty = urlProp.getProperty("DriverProperty");
			driverPath = urlProp.getProperty("DriverPath");
			
			
		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}
	
	public String selectBrowser(){
		
		return browser;
		
	}
	public String selectUsername(){
		
		return username;
		
	}
	public String selectPassword(){
	
		return password;
	
	}
	public String selectBaseUrl(){
	
		return baseURL;
	}
	public String selectDriverProperty(){
		
		return driverProperty;
	
	}
	public String selectDriverPath(){
		
		return driverPath;
	}

}
