package co.uk.safebear;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-repor/cucumber.json"},
        tags ="not @to-do"
        //glue ="path to Stepdefs if not in the same folder",
        //features ="path to features if not in co.uk.safebear folder"
)
public class RunCucumberTest {
}
