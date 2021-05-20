package Main;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class main extends Excel {

	public WebDriver driver;

	@Before
	@Given("launch browser and navigate to application")
	public void launchBrowser() {
		System.out.println("Launching browser");
		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object
		driver.manage().window().maximize();
		// driver.get("https://www.resolve6training.ca/");

		Excel ex = new Excel();
		try {
			String data = ex.excel_R();
			System.out.println(data);
			driver.get(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("I mouse on to IT training programs tab")
	public void mouseon() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-458\"]/a"))).build().perform();

	}
	@Then("print all the drop down options")
	public void dropdownmenu() {
		List<WebElement> elements= driver.findElements(By.xpath("//*[@id=\"menu-item-458\"]/ul"));
		for(WebElement e: elements) {
			System.out.println(e.getText());
		}
	}

}
