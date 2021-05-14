import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtest {
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
	@Test
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
