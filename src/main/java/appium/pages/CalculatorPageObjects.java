package appium.pages;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidElement;

public class CalculatorPageObjects {

	@FindBy (id = "calculator_button")
	AndroidElement btnCalculator;
	
	@FindBy (id = "")
	AndroidElement btnSum;
	
	@FindBy (id = "")
	AndroidElement btnDiv;
	
	@FindBy (id = "")
	AndroidElement btnSub;
	
	@FindBy (id = "")
	AndroidElement btnMilt;
	
	@FindBy (id = "")
	AndroidElement btnPoint;
}
