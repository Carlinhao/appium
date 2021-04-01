package appium.utilities;

import java.net.MalformedURLException;

import org.openqa.selenium.interactions.touch.TouchActions;

import appium.base.AppiumStart;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ActionsHelpers {

	private AndroidDriver<AndroidElement> _driver;
	
	public ActionsHelpers() throws MalformedURLException {
		_driver = AppiumStart.androidDriver();
	}
	
	public void tapElement(AndroidElement element) {
		new TouchActions(_driver)
		.singleTap(element).perform();
	}
	
	public void doubleTapElement(AndroidElement element) {
		new TouchActions(_driver)
		.doubleTap(element).perform();
	}
	
	public void scroolElement(AndroidElement element) {
		new TouchActions(_driver)
		.scroll(element, 10, 100)
		.perform();;
	}
}
