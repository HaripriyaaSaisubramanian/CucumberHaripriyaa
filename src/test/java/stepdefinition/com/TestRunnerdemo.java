package stepdefinition.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\home\\eclipse-workspace\\Cucumber\\src\\test\\resources\\feature\\demo.feature",glue="stepdefinition.com",plugin="html:target",dryRun=true)
public class TestRunnerdemo {

}
