package screen;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import helper.AppiumDriverHelper;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseScreen {

    public BaseScreen(){
        PageFactory.
                initElements( new AppiumFieldDecorator(AppiumDriverHelper.getDriver(), Duration.ofSeconds(15) ), this );
    }
}
