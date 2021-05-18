package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //run cucumber class
@CucumberOptions(features="C:\\Users\\Govin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Feature",
glue="steps" ,tags=" @searchText"  )// establish a connection to feature file and steps file
//tags included so only that test case will be executed
public class cucumberRunner {

	
}
