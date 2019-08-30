package com.btrix.step_definitions;

import com.btrix.utilities.ConfigurationReader;
import com.btrix.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(scenario.getName());
        Driver.getDriver().manage().window().fullscreen();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

  @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot =(TakesScreenshot) Driver.getDriver();
            byte[]image=takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image,"image/png");
        }
        Driver.close();
    }
}