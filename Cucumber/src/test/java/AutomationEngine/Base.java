package AutomationEngine;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;




public class Base {

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
		driver.get("https://www.amazon.com/ref=nav_logo");
		
		}
		else if (browsers.equalsIgnoreCase("msedge")) {
			
			String msedgepath=currentDir+"//msedgedriver.exe";
			
		//	String Driverpath = "C:\\Users\\Govin\\Resolve6\\edgedriver_win32\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", msedgepath); // set ie driver and location
			// System.setProperty("webdriver.gecko.driver", Driverpath); for firefox
			//System.setProperty("webdriver.ie.driver", Driverpath);
			driver = new EdgeDriver(); // driver object
			driver.get("https://www.amazon.com/ref=nav_logo");
			
		}
		//driver.get("https://www.amazon.com/ref=nav_logo");
	}
	
	public WebElement findElement(String locator,String value) {
		WebElement webelement = null;
		
		if(locator.equalsIgnoreCase("xpath")) {
			webelement = driver.findElement(By.xpath(value));
		}else if(locator.equalsIgnoreCase("css")) {
			webelement = driver.findElement(By.cssSelector(value));
		}else if(locator.equalsIgnoreCase("id")) {
			webelement = driver.findElement(By.id(value));
		}else if(locator.equalsIgnoreCase("name")) {
			webelement = driver.findElement(By.name(value));
		}else if(locator.equalsIgnoreCase("linkText")) {
			webelement = driver.findElement(By.linkText(value));
		}
		return webelement;
		
	}
	
	public String GetText(String locator, String value) {
		String Text=findElement(locator,value).getText();
		return Text;
	}
	
	public void click(String locator, String value) {
		findElement(locator,value).click();
	}
	
	//All selenium methods will be in base class
}
