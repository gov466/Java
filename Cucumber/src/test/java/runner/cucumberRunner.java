package runner;

import org.junit.runner.RunWith; //can be done tith testng also

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //run cucumber class
@CucumberOptions(features="C:\\Users\\Govin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Feature",
glue="steps" ,tags="@searchText" ,
plugin= {"pretty","html:target/cucumberreport/report.html","json:target/target/cucumberreport/jreport.json","junit:target/target/cucumberreport/xreport.xml",
		"rerun:target/failedscenario.txt",},  //failed test cases result will come to this file
monochrome=true //output in meaningfull way
//dryRun=true //if any step is not implemented dryrun will infoirm us that
)// establish a connection to feature file and steps file
//tags included so only that test case will be executed
public class cucumberRunner {

	
}
