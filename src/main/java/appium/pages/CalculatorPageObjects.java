package appium.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appium.base.AppiumStart;
import appium.utilities.ElementsConfiguration;
import io.appium.java_client.android.AndroidElement;

public class CalculatorPageObjects {

	@FindBy (id = ElementsConfiguration.btn_Calculator)
	AndroidElement btnCalculator;
	
	@FindBy (id = ElementsConfiguration.btn_Sum)
	AndroidElement btnSum;
	
	@FindBy (id = ElementsConfiguration.btn_Div)
	AndroidElement btnDiv;
	
	@FindBy (id = ElementsConfiguration.btn_Sub)
	AndroidElement btnSub;
	
	@FindBy (id = ElementsConfiguration.btn_Mult)
	AndroidElement btnMult;
	
	@FindBy (id = ElementsConfiguration.btn_Point)
	AndroidElement btnPoint;
	
	@FindBy (id = ElementsConfiguration.btnNumber_0)
	AndroidElement btnZero;
	
	@FindBy (id = ElementsConfiguration.btnNumber_1)
	AndroidElement btnOne;
	
	@FindBy (id = ElementsConfiguration.btnNumber_2)
	AndroidElement btnTwo;
	
	@FindBy (id = ElementsConfiguration.btnNumber_3)
	AndroidElement btnThree;
	
	@FindBy (id = ElementsConfiguration.btnNumber_4)
	AndroidElement btnFour;
	
	@FindBy (id = ElementsConfiguration.btnNumber_5)
	AndroidElement btnFive;
	
	@FindBy (id = ElementsConfiguration.btnNumber_6)
	AndroidElement btnSix;
	
	@FindBy (id = ElementsConfiguration.btnNumber_7)
	AndroidElement btnSeven;
	
	@FindBy (id = ElementsConfiguration.btnNumber_8)
	AndroidElement btnEight;
	
	@FindBy (id = ElementsConfiguration.btnNumber_9)
	AndroidElement btnNine;
	
	
	public CalculatorPageObjects() throws MalformedURLException {
		PageFactory.initElements(AppiumStart.androidDriver(), this);
	}
	
	
}
