package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel {

	public WebDriver driver;
	
	@Parameters("browsers")
	@Test
	public void method1(String browsers) {
		
		
		if(browsers.equalsIgnoreCase("chrome"))
		{
		
		System.out.println("Launching browser");
		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object
	
		
		}
		else if (browsers.equalsIgnoreCase("msedge")) {
			String Driverpath = "C:\\Users\\Govin\\Resolve6\\edgedriver_win32\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", Driverpath); // set ie driver and location
			// System.setProperty("webdriver.gecko.driver", Driverpath); for firefox
			System.setProperty("webdriver.ie.driver", Driverpath);
			driver = new EdgeDriver(); // driver object
			//driver.get("https://www.amazon.com/ref=nav_logo");
			
		}
		driver.get("https://www.amazon.com/ref=nav_logo");
	}
}
