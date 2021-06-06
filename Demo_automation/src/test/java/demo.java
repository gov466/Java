import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 
public class demo {
	
public static WebDriver driver;
	
	@Test
	public void browser() {
		String currentDir= System.getProperty("user.dir");
		System.out.println("Launching browser");
		
		//System.out.println(currentDir);
		String msedgepath=currentDir+"//msedgedriver.exe";
		//String Driverpath = "C:\\Users\\Govin\\Resolve6\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.edge.driver", msedgepath);  // set ie driver and location
		driver = new EdgeDriver(); // driver object
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/");
		
	}
	@Test
	public void register() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("govind.mndy@gmail.com");
		driver.findElement(By.xpath("//*[@id='enterimg']")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Raj");
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("Govind");
		
		driver.findElement(By.xpath("//*[@id ='basicBootstrapForm']/div[2]/div[1]/textarea")).sendKeys("200 Abc Ave,Toronto, M5G9G6");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("govind.mndy@gmail.com");
		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("6476470000");
		
		WebElement radio_1= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		radio_1.click();
		
		WebElement checkbox_1=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div/div[1]/input"));
		checkbox_1.click();
		WebElement checkbox_2=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div/div[2]/input"));
		checkbox_2.click();
		WebElement checkbox_3=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div/div[3]/input"));
		checkbox_3.click();
//		
	//	driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div[1]/multi-select/div[2]/ul")).click();
		Actions action = new Actions(driver);
//     	WebElement language= driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
//		action.click(language).build().perform();
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
//		WebElement language = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul"));
//	    Select sel_language = new Select(language);
//	    List<WebElement> options = sel_language.getOptions();
//
//	    for (WebElement option : options) {
//	        System.out.println(option.getText());
//	        if (option.getText().equals("English")) {
//	            option.click();
//	            
//	        }
//	    }
		
		
		WebElement skills= driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select sel_skills = new Select(skills);
		sel_skills.selectByValue("HTML");

		WebElement countries= driver.findElement(By.xpath("//*[@id=\"countries\"]"));
		Select Sel_country = new Select(countries);
		Sel_country.selectByValue("India");
		
	//	WebElement country= driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]"));
		//Select Sel2_country = new Select(country);
		//Sel2_country.selectByValue("India");
		
		//driver.findElement(By.xpath("//*[@class='select2-selection__arrow']")).click();
		 
		
		WebElement Country_1= driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--single']"));
		action.click(Country_1).build().perform();
		
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("India");
		WebElement select2Country= driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li"));
		action.click(select2Country).build().perform();
		
		WebElement year= driver.findElement(By.xpath("//*[@id='yearbox']"));
		Select Sel_year = new Select(year);
		Sel_year.selectByValue("1994");
		
		WebElement month= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select Sel_month = new Select(month);
		Sel_month.selectByValue("January");
		
		WebElement date= driver.findElement(By.xpath("//*[@id='daybox']"));
		Select Sel_date = new Select(date);
		Sel_date.selectByValue("17");
		
		driver.findElement(By.xpath("//*[@id='firstpassword']")).sendKeys("Govind@123");
		
		driver.findElement(By.xpath("//*[@id='secondpassword']")).sendKeys("Govind@123");
		
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		
		//move to switch
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]"))).build().perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=dismiss-button")).click();
		String currentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		
		driver.switchTo().window(currentwindow);
		
		//Select Sel_country2 = new Select(Country_1);
		//Sel_country2.selectByVisibleText("India");
		
		//System.out.println("entered the word");
		//driver.close();
	}
}