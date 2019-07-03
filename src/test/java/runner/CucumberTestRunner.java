package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import helper.AppiumDriverHelper;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinition")
public class CucumberTestRunner {
    @BeforeClass
    public static void tearUp(){
        AppiumDriverHelper.getDriver();

    }

    @AfterClass
    public static void tearDown(){
        AppiumDriverHelper.closeDriver();

    }

}