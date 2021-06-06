package main;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public WebDriver driver;
	@Before
	public void launchBrowser() {
		
		String currentDir= System.getProperty("user.dir"); //cuurent directory location
		String browsers= "chrome";
		
		if(browsers.equalsIgnoreCase("chrome"))
		{
		
		System.out.println("Launching browser");
		
		//System.out.println(currentDir);
		String chromepath=currentDir+"//chromedriver.exe";
		//String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath); // set ie driver and location
		driver = new ChromeDriver(); // driver object
		driver.get("http://demo.automationtesting.in/");
		
		}

}
}
