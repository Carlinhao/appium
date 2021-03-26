package appium.utilities;

import appium.base.AppiumStart;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class DynamicWaits {
    private static WebDriverWait waitElement;

    public static WebDriverWait waitElement() throws MalformedURLException {
        waitElement = new WebDriverWait(AppiumStart.androidDriver(), 25);
        return waitElement;
    }
}
