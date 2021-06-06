package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

	@RunWith(Cucumber.class) //run cucumber class
	@CucumberOptions(features="C:\\Users\\Govin\\git\\Java\\Assignment_5\\src\\test\\resources\\Feature\\automationtesting.feature",
	glue="Main")// establish a connection to feature file and steps file
	//tags included so only that test case will be executed
	public class cucum_runner {

		
	}