package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mavenn {

public static WebDriver driver;
	
	@BeforeTest
	public void browser() {
		
		System.out.println("Launching browser");
		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object
		driver.get("https://www.google.ca");
		
		 
		System.out.println("running Before test ");
	}
	@Test
	@Parameters({"word"}) //we can send this paramter from textng xml file
	public void enterword(String name) {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(name);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")).click();
		//System.out.println("entered the word");
		//driver.close();
	}
	@Test
	public void verifytitle() {
		String title =driver.getTitle();
		System.out.println("the title printed is ==" +title);
		//System.out.println("entered the password");
		//driver.close();
		//instead f using if statement we can use assert
		//if fails its going to stop execution at that point and mrthof fails
		
		Assert.assertEquals(title, "Introduction to Java","verfication of title");
	}
	
}
