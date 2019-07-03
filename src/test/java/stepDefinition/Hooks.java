package stepDefinition;

import java.io.File;

import org.junit.After;

import cucumber.api.Scenario;
import support.Utils;

public class Hooks {

    @After //import cucumber.api.java.After;
    public void after(Scenario scenario){
        File screenshot = Utils.gerarScreenShot(scenario);
        Utils.embedScreenshot(screenshot, scenario.getName());
    }

}