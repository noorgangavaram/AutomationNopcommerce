package com.nopcommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;  // This object for properties class
	
	// This is Constructor
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream FIS = new FileInputStream(src);  // to read data from the file we have to use InputStream
			properties = new Properties();
			properties.load(FIS); // This will load complete config.properties file
		}catch(Exception e) {
			System.out.println("Exception is : "+ e.getMessage());
		}
		
	}
	
	//we have to create different methods to read each and every variable present in the config.properties file
	
	public String getApplicationURl() {
		String url = properties.getProperty("baseURL");
		return url;
	}
	
	public String getUSername() {
		String username = properties.getProperty("UserName");
		return username;
	}
	
	public String getPassword() {
		String password = properties.getProperty("Password");
		return password;
	}
	
	public String getFirefoxPath() {
		String firefoxPath = properties.getProperty("firefoxpath");
		return firefoxPath;
	}
	
	public String getItem() {
		String ItemName = properties.getProperty("Item");
		return ItemName;
	}
	
	public String getFirstName() {
		String Fname = properties.getProperty("FirstName");
		return Fname;
	}
	
	public String getLastName() {
		String Lname = properties.getProperty("LastName");
		return Lname;
	}
	
	public String getEmail() {
		String email = properties.getProperty("mail");
		return email;
	}
	
	public String getPassword1() {
		String Pwd = properties.getProperty("Password");
		return Pwd;
	}
	
	public String getConfirmPassword() {
		String ConfiPwd = properties.getProperty("ConfirmPassword");
		return ConfiPwd;
	}
	
	public String getTitle() {
		String title = properties.getProperty("Title");
		return title;
	}
	
	public String getComment() {
		String comment = properties.getProperty("Comment");
		return comment;
	}
}
