package appium.utilities;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClickBtnHelper {
	
	public static void clickBtn(WebElement element) throws MalformedURLException {
		DynamicWaits.waitElement().until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}
