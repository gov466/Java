package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //run cucumber class
@CucumberOptions(features={"@target/failedscenario.txt",},
glue="steps" ,//tags="@searchText" ,
plugin= {"pretty","html:target/cucumberreport/report.html","json:target/target/cucumberreport/jreport.json","junit:target/target/cucumberreport/xreport.xml",
		} )
public class Rerun {

}
