package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import AutomationEngine.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends Base{

	@When ("I search with a {string}") //passing text from feature file
	//to pass a variable earlier rational exoression now direclty as string
	public void search(String text) {
		launchBrowser();
		driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(text);
	}
	
	@When ("I click on search button")
	public void clickSearch() {
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
		
	}
	@Then ("Verify the output is {string}")
	public void verifyresult(String txt) {
		WebElement e =driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]"));
		String actualvalue = e.getText();
		System.out.println(actualvalue);
		
		
		
		if(actualvalue.equalsIgnoreCase(txt)) {
			System.out.println("Verified");
		}
		else {
			System.out.println("failed");
		}
		
		
		
	}
}

