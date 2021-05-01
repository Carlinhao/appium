package appium.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import appium.utilities.ReadFileProperties;
import java.net.URL;

public class AppiumStart {

	private static AndroidDriver<AndroidElement> driver;
	private static ReadFileProperties read;

	public AppiumStart() {
		read = new ReadFileProperties();
	}

	public static AndroidDriver<AndroidElement> androidDriver() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformVersion", "9");
			caps.setCapability("automationName", "UiAutomator2");
			caps.setCapability("deviceName", "Android Emulator");
			caps.setCapability("platformName", "Android");
			caps.setCapability("noReset", "false");
			caps.setCapability("app", System.getProperty("user.dir") + "\\src\\test\\resources\\app\\calck.apk");
			driver = new AndroidDriver<AndroidElement>(new URL(read.url() + read.appiumPort() + "/wd/hub"), caps);

			return driver;
		} catch (Exception e) {
			System.out.println("Erro o inicializar app: "+ e.getMessage());
		}
		return null;
	}
}
