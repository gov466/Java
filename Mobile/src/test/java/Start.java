import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Start {
	@Test
	public void launchAPP() throws MalformedURLException {
		
		String currentDir=System.getProperty("user.dir");
		String apkpath=currentDir+"//ApiDemos-debug.apk";
		
		DesiredCapabilities Cap=new DesiredCapabilities();
		//identify the emulator with regards to name
		//Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DEVICENAME");
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "GovindVDD");
		Cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,10);
		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2"); //appium reccomend to use this.
		//deploy the demo apk into emulator/virtual device
		Cap.setCapability(MobileCapabilityType.APP,apkpath);
		
		//invoking andriod driver
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),Cap);//giving my appium server locaton
																						//mylocalhostid:4723/webdriver/hub
		// 127.0.0.1:4723 --zeros talks about local host
		
		driver.findElement(By.xpath("//*[@text='App']")).click(); //calling attribute
//		TouchActions action= new TouchActions(driver); // same as actiion for mouse adcion in selenium
//		action.scroll(null, 0, 0);// null-path,width,height
//		
//		//dimension
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size.getHeight()); //ht of screen
//		System.out.println(size.getWidth());
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().textContains(\"Voice Recognition\"))"));

		
	}
}
