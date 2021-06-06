package Pages;

import org.openqa.selenium.By;

import locators.customerservicelocators;
import main.Main;

public class automationtesting extends Main {

	automationtesting locator = new automationtesting();
	
	public void clickonregister() {
		click("xpath", locator.AmazonLabelXpath);
		//driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
		//driver.findElement(By.partialLinkText("Customer Service")).click();
	}
}
