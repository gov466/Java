package Pages;

import org.openqa.selenium.By;

import AutomationEngine.Base;
import locators.customerservicelocators;

public class CustomerServicePage extends Base {

	customerservicelocators locator = new customerservicelocators();
	
	public void clickonCustomerService() {
		click("xpath", locator.AmazonLabelXpath);
		//driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
		driver.findElement(By.partialLinkText("Customer Service")).click();
	}
}
