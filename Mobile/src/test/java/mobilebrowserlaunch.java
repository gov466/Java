import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class mobilebrowserlaunch {
	
	public static AndroidDriver<WebElement> driver;
	public void launchChrome() throws MalformedURLException{
		
		DesiredCapabilities Cap=new DesiredCapabilities();
		//identify the emulator with regards to name
		//Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DEVICENAME");4
		Cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		Cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "GovindVDD");
		Cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,10);
		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2"); 
		Cap.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		
		//invoking andriod driver//driver instance
		  driver= new AndroidDriver<WebElement> (new URL("http://127.0.0.1:4723/wd/hub"),Cap);//giving my appium server locaton
////			driver.get("https://www.google.com/");
////			driver.findElement(By.name("q")).sendKeys("phone");
//				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//				driver.get("https://www.amazon.in/");
//				driver.findElement(By.name("k")).sendKeys("phones");
//				driver.findElement(By.xpath("//*[@aria-label='Go']")).click();
				
				//return driver;
}
}
