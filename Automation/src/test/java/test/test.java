package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Customerservice;

public class test {
//whatever isnide QA can be run using xml file
public static WebDriver driver;
	
	@BeforeTest
	public void browser() {
		
		System.out.println("Launching browser");
		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object
		driver.get("https://www.google.ca");
		
		String url="https://www.facebook.com/";
		driver.get(url);
		System.out.println("running Before test ");
	}
	@Test
	public void verifycustomerservice() {
		
		Customerservice cs = new Customerservice();
		cs.clickCustomerservice();
		Assert.assertEquals(cs.getText()," ");
	}
	
	
	//groups for running purticular msg..like 'include' in xml
	//when run with groups browser method will not run
	@Test(groups= {"smoke","regression"})
	@Parameters({"emailid"}) //we can send this paramter from textng xml file
	public void enterEmail(String name) {
		driver.findElement(By.name("email")).sendKeys(name);
		System.out.println("entered the mail id");
		//driver.close();
	}
	@Test(groups = {"regression"})
	@Parameters({"password"}) //paramter --passing info from textng xml file//value passed to parameter from  textng
	public void entePassword(String pass){
		driver.findElement(By.name("pass")).sendKeys(pass);
		System.out.println("entered the password");
		//driver.close();
	}
	//XML commands
	//<methods>
    //<exclude name ="enterEmail"/>
    //</methods> in xml file will not run enterEmail methof
	// 'include' will only execute that meythod
	
	@Test(groups= {"smoke","Bvt"}) //basic validation test
	public void verifytitle() {
		String title =driver.getTitle();
		System.out.println("the title printed is ==" +title);
		//System.out.println("entered the password");
		//driver.close();
		//instead f using if statement we can use assert
		//if fails its going to stop execution at that point and mrthof fails
		
		Assert.assertEquals(title, "Facebook - Log In or Sign Up","verfication of title");
	}
}
