package helper;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDriverHelper {

    private static AppiumDriver<MobileElement> appiumDriver;

    public static AppiumDriver<MobileElement> createDriver() {

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 27");
            cap.setCapability(MobileCapabilityType.APP, new File("apk/sample CRUD_v1.0_apkpure.com.apk"));
            appiumDriver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

        }catch (MalformedURLException e){
            System.out.println( e.getMessage() );

        }

        return appiumDriver;
    }

    public static AppiumDriver<MobileElement> getDriver()  {
        if (appiumDriver == null){
            return createDriver();
        }
        return  appiumDriver;
    }

    public static void closeDriver(){

        appiumDriver.quit();
    }
}
