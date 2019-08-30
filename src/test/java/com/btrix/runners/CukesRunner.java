package com.btrix.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","html:target/default-cucumber-reports"},
        features = {"src/test/resources/features"},
        tags = {"@verify_title"},
        glue = {"com/btrix/step_definitions"},
        dryRun =false
)
public class CukesRunner {


}
