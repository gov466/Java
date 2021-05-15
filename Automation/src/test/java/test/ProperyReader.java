package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ProperyReader {
	
	public String data="";
	
	public String getData(String key) {
		File src= new File("C:\\Users\\Govin\\git\\Java\\Automation\\src\\test\\resources\\seleniumdata.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			Properties prop = new Properties(); //to read property file
			prop.load(fis);
			//prop.get("url");
			System.out.println("the value for key is" +prop.get(key));
			data=prop.getProperty(key);
			
		} catch (Exception e) { //exception is parent of all exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
