package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles/Test3.feature", // The path of the features folder files
		glue = {"com.stepdef"}, // The path of the step definition files
		//tags = {"@smoke"}, 
		//plugin = {"pretty", "html:target/cucumber", "json: target/cucumber.json", "junit:target/cukes.xml"}, // To generate different types of reporting
		//plugin = {"usage"},
				plugin = {"pretty","html:target/CucumbreReport"},
				monochrome = true, // display the console in a proper readable format
				dryRun = false, // to check the mapping proper between feature file and step definition file
				strict = false // it will check if any step is not defined in step definition file
		)
public class RunnerClass {

}
