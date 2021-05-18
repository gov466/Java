package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import AutomationEngine.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AmazonCSSteps extends Base {
	
	
	
	@Given("launch browser and navigate to application")
	public void loginfunction() {
		
		
		
		
	}
	@When("I click on customer service link")
	public void clickCustomerServicelink() {
		launchBrowser();
		driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
		driver.findElement(By.partialLinkText("Customer Service")).click();
	}

	@Then("verify the text inside the screen")
	public void Verifytext() {
		
		String Actualvalue= driver.findElement(By.cssSelector(".a-section")).getText();
		//Assert.assertEquals("Hello. What can we help you with?",Actualvalue);
		System.out.println(Actualvalue);
	}
	@Then("print all the servicetabs available")
	public void printtabs() {
		List<WebElement> elements= driver.findElements(By.xpath("//div[@class='a-row a-grid-vertical-align a-grid-top']/div[2]/h3"));
	for(WebElement e: elements) {
		System.out.println(e.getText());
	}
	}
}
