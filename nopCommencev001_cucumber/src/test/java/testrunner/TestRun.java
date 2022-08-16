package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
             (
            	features=".//Features/Login.feature",
            	glue="stepDefinitions",
            	dryRun=false,//it,s cross check wherther implemted or not.
            	monochrome=true,//remove unnessaru characher in your concosle.
            	plugin= {"pretty","html:test_output"}//report//pretty is my o/p print clearly then to genarete html report
            )


public class TestRun {

}
