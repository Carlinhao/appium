package appium.utilities;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import appium.base.AppiumStart;

public class InsertTextHelper {

	public static void insertText(WebElement element, String text) throws MalformedURLException {
		DynamicWaits.waitElement().until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		element.sendKeys(text);
		AppiumStart
			.androidDriver()
			.hideKeyboard();
	}
}
