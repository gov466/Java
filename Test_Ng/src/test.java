import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//anotations given by TestNg-BeforeTest, BeforeMethod, Test, Test(priority)
//Class level @Test can be also done
public class test {
	public static WebDriver driver;
//Java progrm running using testng framework
	//not sequential..alphabetical ordr method executes
	//Before test will run first
	//test output folder consists emaialble report
	//Before method-method starts everyth other method
	
	//@BeforeMethod
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
	public void enterEmail() {
		driver.findElement(By.name("email")).sendKeys("QA");
		System.out.println("entered the mail id");
		//driver.close();
	}
	@Test
	public void entePassword() {
		driver.findElement(By.name("pass")).sendKeys("pass");
		System.out.println("entered the password");
		//driver.close();
	}
	
	//Aftermethod happens after every methid
	//Aftertest happens after every test get executed
	@AfterTest
	public void close() {
		//driver.close();
		System.out.println("after test method");
	}
//	@AfterTest
//	public void teardown() {
//		System.out.println("After test running");
//		driver.quit();
//		
//	}
	//first method
	@BeforeSuite
	public void before_suite() {
		System.out.println("running before suite");
	}
	//last method
	@AfterSuite
	public void after_suite() {
		System.out.println("running after suite");
	}
	@BeforeClass
	public void before_class() {
		System.out.println("running before class");
	}
	@AfterClass
	public void after_class() {
		System.out.println("running after class");
	}
	@BeforeMethod
	public void before_method() {
		System.out.println("running before method");
	}
	@AfterMethod
	public void after_method() {
		System.out.println("running after method");
	}
	
	
	
	
}
