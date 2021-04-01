package appium.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumStart {

    private static AndroidDriver<AndroidElement> driver;


    public static AndroidDriver<AndroidElement> androidDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "9");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("noReset", "false");
        caps.setCapability("app", System.getProperty("user.dir")+"\\src\\test\\resources\\app\\calck.apk");
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        
        return driver;
    }
}
