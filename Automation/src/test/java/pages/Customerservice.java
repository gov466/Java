package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customerservice {

	public WebDriver driver;

	public void clickCustomerservice() {
		driver.findElement(By.name("")).click();
	}

	public String getText() {
		String value = driver.findElement(By.name("//h2[@class='a-spacing-none a-text-normal']")).getText();
		return value;
	}

	public void ClickyourOrder() {
		
	}
}
