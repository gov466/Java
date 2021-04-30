import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class firstprog {

	public static WebDriver driver; // making static beacuse driver is commion in all methods

	public void IEbrowser() {

		String Driverpath = "C:\\Users\\Govin\\Resolve6\\IEDriverServer\\IEDriver.exe";
		System.setProperty("webdriver.ie.driver", Driverpath); // set ie driver and location
		// System.setProperty("webdriver.gecko.driver", Driverpath); for firefox
		System.setProperty("webdriver.ie.driver", Driverpath);
		driver = new ChromeDriver(); // driver object

		//driver.get("https://www.selenium.dev/"); // get the URL
	}

	public void chromebrowser() {

		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object

		// driver.get("https://www.selenium.dev/"); // get the URL
	}

	public static void main(String[] args) {

		firstprog f = new firstprog();
		f.chromebrowser();

		driver.get("https://www.facebook.com/"); // get the URL and takes to page
//	driver.close();// close browser
		driver.manage().window().maximize();
		//locators in webpage
		//driver.findElement(By.name("email")).sendKeys("myname"); //finds location to enter email in fb and sends my name as arguemnts
		//driver.findElement(By.id("email")).sendKeys("govind.mndy@gmail.com"); ///locator ID
		//driver.findElement(By.id("pass")).sendKeys("Wipro@2125");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("Govind"); //classname
		driver.findElement(By.cssSelector("input#email")).sendKeys("Govind");
		driver.findElement(By.xpath("//input[@type='text']//following::input[1]")).sendKeys("Govind");
		
		System.out.println(driver.getTitle()); //command for get title of page(tab name)
		driver.navigate().to("https://secure.celpip.ca/RegWebApp/#/registration/sitting-selection");
		driver.navigate().back();
		//driver.findElement(By.linkText("Forgot Password?")).click(); //linktext
		//driver.findElement(By.partialLinkText("Forgot")).click(); //partial link text
	
		
	}
}
