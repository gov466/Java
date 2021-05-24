package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Customerservice;


@Listeners(util.Listener.class)
public class Ntest {
//whatever isnide QA can be run using xml file
public static WebDriver driver;
	
	//@BeforeTest

@Test(priority=0)
	public void browser() throws IOException {
		
		System.out.println("Launching browser");
		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object
		//driver.get("https://www.google.ca");
		
		String url="https://www.amazon.com/";
		driver.get(url);
		System.out.println("running Before test ");
		
		//taking screeenshot
//		TakesScreenshot s=((TakesScreenshot)driver);
//		File src=s.getScreenshotAs(OutputType.FILE);
//		String location="target/snapshot";
//		File destination= new File(location);
//		FileUtils.copyFile(src, destination); //not directly available so adding dependencies
//		
	}
	

	@Test(priority=1)
	public void verifycustomerservice() {
		driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
		driver.findElement(By.partialLinkText("Customer Service")).click();
		Customerservice cs = new Customerservice();
		cs.clickCustomerservice();
		System.out.println(cs.getText());
		Assert.assertEquals(cs.getText(),"Some things you can do here");
	}
	@Test(priority=2)
	public void verifyScreen() {
		Assert.assertTrue(false);
	}
}
	
	
	