import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGG {

	public static WebDriver driver;
	
	//no need to use public static void main string argds
	@Test 
	public void print() {
		String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driverpath); // set ie driver and location
		driver = new ChromeDriver(); // driver object
		driver.get("https://www.google.ca");

	}
	
}
