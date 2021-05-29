import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class TestClass extends mobilebrowserlaunch {
	
	@Test
	public void AmazonTest() throws MalformedURLException {
	launchChrome();
	//driver.get("https://www.google.com/");
//	driver.findElement(By.name("q")).sendKeys("phone");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("k")).sendKeys("phones");
		driver.findElement(By.xpath("//*[@aria-label='Go']")).click();
//scrolling down to Related searches
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().textContains(\"Related searches\"))"));

	}
}