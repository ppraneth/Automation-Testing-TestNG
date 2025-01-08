package org.Runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//Tags @Custom_Tags above scenario and writing it after glue will run the exact tag on the scenario
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"},features = "src/test/java/org/Features"
        ,glue = "org.Stepdef" ,tags = "@T1"
)

public class Runner1 {


}
