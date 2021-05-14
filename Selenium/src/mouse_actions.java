import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouse_actions {

	public static WebDriver driver; // making static beacuse driver is commion in all methods

	public void IEbrowser() {

		String Driverpath = "C:\\Users\\Govin\\Resolve6\\IEDriverServer\\IEDriver.exe";
		System.setProperty("webdriver.ie.driver", Driverpath); // set ie driver and location
		// System.setProperty("webdriver.gecko.driver", Driverpath); for firefox
		System.setProperty("webdriver.ie.driver", Driverpath);
		driver = new ChromeDriver(); // driver object

		// driver.get("https://www.selenium.dev/"); // get the URL
	}

	public void chromebrowser() {

		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object

		// driver.get("https://www.selenium.dev/"); // get the URL
	}

	public static void main(String[] args) throws InterruptedException {

		mouse_actions f = new mouse_actions();
		f.chromebrowser();

		// how to perfrom right click by action class
		String url = "https://www.facebook.com/r.php?locale=en_US&display=page";
		driver.get(url);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		// action.moveToElement(driver.findElement(By.xpath("//div[text()='Facebook']"))).build().perform();
		// action.contextClick().build().perform(); //rightclick
		// driver.findElement(By.name("email")); //web element
		WebElement email = driver.findElement(By.name("email"));
		WebElement log = driver.findElement(By.xpath("//input[@value=\"Log Into Existing Account\" ]"));
		action.click(log).build().perform();
		action.click(email).build().perform(); // click to that space
		// action.sendKeys(email,Keys.DOWN.SHIFT); //capital random
		action.sendKeys(email, "random").build().perform();
		// action.click(email).build().perform();
		action.doubleClick().build().perform(); // highlighted text
		// performing keyboard actions

		// dropdown options- select class
		WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(ele);
		// month.selectByValue("9"); //selecting month by value given in inspect
		// month.selectByVisibleText("Oct"); //selecting by visible text
		month.selectByIndex(1);

		List<WebElement> allmonths = month.getOptions(); // to get all list of options

		// for(WebElement mn:allmonths) {
		// System.out.println(mn.getText());
		// }

		WebElement gender = driver.findElement(By.xpath("//label[@class='_58mt']"));
		System.out.println(gender.getText()); // gettext copy text from field
		String gendername = gender.getText();
		if (gendername.contains("Female")) {
			System.out.println("Match found");
		}

		// handle popup -alert
		// driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//span[@ data-type='radio']/span[1]/input")).click(); // select first button
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//span[@ data-type='radio']/span/input"));

		for (WebElement btn : radiobuttons) {
			{
				if (btn.isSelected()) {
					System.out.println("radio button selected");
					break;
				} else {
					System.out.println("No radio button selected");
				}
			}

		}
		String currentwindow = driver.getWindowHandle(); //current window
		WebElement forgotpass = driver.findElement(By.partialLinkText("Forgot account"));
		action.moveToElement(forgotpass);
		action.keyDown(Keys.CONTROL);
		action.click().build().perform();
		action.keyUp(Keys.CONTROL);
		
		// window handling
		WebElement fb = driver.findElement(By.xpath("//a[@title=\"Go to Facebook Home\"]"));
		action.moveToElement(fb);
		action.keyDown(Keys.CONTROL);
		action.click().build().perform();
		action.keyUp(Keys.CONTROL);
//moving to next window
		
		Set<String> windows = driver.getWindowHandles(); // set will not have duplicate values

		for (String winw : windows) {
			driver.switchTo().window(winw); // control goes to second widnwo

			if (driver.getTitle().contains("Facebook-Log In or Sign Up")) {
				System.out.println("we are in expeected wondow");
				break;
			}
		}
		driver.switchTo().window(currentwindow);
		
		//waits
		//hardwait
		Thread.sleep(3000); //not reccomeneded -onlu for debugging
		//synchronisation
		//implicit wAIT- slow down the execution -stops execution for every webelement
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		//explicit wait-use every often- stops executin only for purticular element
		WebDriverWait w =new WebDriverWait(driver, 15); 
		w.until(ExpectedConditions.elementToBeClickable(fb)); 
		
		//fluent wait
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(15,TimeUnit.SECONDS).pollingEvery(3,TimeUnit.SECONDS).ignoring(Exception.class);
	
	}
}
