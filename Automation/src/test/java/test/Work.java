package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 

public class Work{ 
	public static WebDriver driver;
	ProperyReader obj1 = new ProperyReader(); //error here
	
	
	@Test
	public void browser() {
		
		System.out.println("Launching browser");
		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object
		driver.get(obj1.data);
		
		//String url="https://www.facebook.com/";
	//	driver.get(url);
		System.out.println("running Before test ");
	}
	//@Test(dependsOnMethods={"Run"})
	//@Test(dataProvider="facebookdata")
	public void login( String username, String password) {
		System.out.println("Login");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		
		//driver.close();
	}
//	@Test
//	public void Run() {
//		System.out.println("I am in run0");
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
	//@DataProvider(name="facebookdata")
	public Object[][] passdata(){
		Object[][] data = new Object[3][2];
		
		data[0][0]="random1";
		data[0][1]="pass1";
		
		data[1][0]="random2";
		data[1][1]="pass2";
		
		data[2][0]="random3";
		data[2][1]="pass3";
		return data;
	}
}
