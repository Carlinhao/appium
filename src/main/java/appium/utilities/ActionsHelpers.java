package appium.utilities;

import java.net.MalformedURLException;

import org.openqa.selenium.interactions.touch.TouchActions;

import appium.base.AppiumStart;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ActionsHelpers {

	private AndroidDriver<MobileElement> _driver;
	
	public ActionsHelpers() throws MalformedURLException {
		_driver = AppiumStart.androidDriver();
	}
	
	public void tapElement(MobileElement element) {
		new TouchActions(_driver)
		.singleTap(element).perform();
	}
	
	public void doubleTapElement(MobileElement element) {
		new TouchActions(_driver)
		.doubleTap(element).perform();
	}
}
