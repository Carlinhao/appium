package appium.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;

import appium.base.AppiumStart;
import appium.utilities.ElementsConfiguration;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ElementsPageObjects {

	@AndroidFindBy (id = "calculator_button")
	AndroidElement btnCalculator;
	
	@AndroidFindBy (id = ElementsConfiguration.btn_Sum)
	AndroidElement btnSum;
	
	@AndroidFindBy (id = ElementsConfiguration.btn_Div)
	AndroidElement btnDiv;
	
	@AndroidFindBy (id = ElementsConfiguration.btn_Sub)
	AndroidElement btnSub;
	
	@AndroidFindBy (id = ElementsConfiguration.btn_Mult)
	AndroidElement btnMult;
	
	@AndroidFindBy (id = ElementsConfiguration.btn_Point)
	AndroidElement btnPoint;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_0)
	AndroidElement btnZero;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_1)
	AndroidElement btnOne;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_2)
	AndroidElement btnTwo;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_3)
	AndroidElement btnThree;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_4)
	AndroidElement btnFour;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_5)
	AndroidElement btnFive;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_6)
	AndroidElement btnSix;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_7)
	AndroidElement btnSeven;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_8)
	AndroidElement btnEight;
	
	@AndroidFindBy (id = ElementsConfiguration.btnNumber_9)
	AndroidElement btnNine;
	
	
	public ElementsPageObjects() throws MalformedURLException {
		PageFactory.initElements(new AppiumFieldDecorator(AppiumStart.androidDriver()), this);
	}	
}
