package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {

	public static WebDriver driver;

	@BeforeTest
	public void browser() {

		System.out.println("Launching browser");
		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object
		driver.get("https://www.amazon.com/");

		System.out.println("running Before test ");

	}

	@Test
	public void mouseon() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]"))).build().perform();
		// driver.findElement(By.linkText("/html/body/div[1]/header/div/div[3]/div[9]/div[2]/a[9]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Change country/region.")).click();
		//WebElement log = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[10]/div[2]/a[9]"));
		//action.moveToElement(log);
		//action.click(log).build().perform();
		Thread.sleep(3000);
		
		//WebElement e = driver.findElement(By.cssSelector("//*[@id='icp-mkt-change-Ink']"));
		//e.click();
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"a-autoid-0-announce\\\"]/span"))).build().perform();
		//action.moveToElement(driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]"))).build().perform();
		//driver.findElement(By.id("a-autoid-0-announce")).click();
		//action.moveToElement(dropdown);
		//action.click(dropdown).build().perform();
		//action.moveToElement(elements);
     	WebElement elements= driver.findElement(By.xpath("//span[@data-action = 'a-dropdown-button']")); 
		elements.click();
		List<WebElement>  el=driver.findElements(By.xpath("//div[@class='a-fixed-left-grid-col a-col-right']/span"));
	    
		for(WebElement ele :el){
			
			System.out.println(ele.getText());
		}
	}
}
