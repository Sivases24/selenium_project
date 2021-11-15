package com.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties p;
	
	public ConfigReader() throws IOException {
	
	
	File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Mini_Project\\src\\main\\java\\com\\Configure\\properties\\Config.properties");

	FileInputStream fis = new FileInputStream(f);
	
	 p = new Properties();
	 p.load(fis);
	}
    public String getusername()  {
    	
    	 String User = p.getProperty("Username");
    	 return User;
	}
    
    public String getpassword()  {
    	
    	String pass = p.getProperty("Password");
    	return pass;
    	
    	
	}

}
