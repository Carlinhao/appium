package appium.tests;

import java.net.MalformedURLException;

import org.junit.Test;

import com.aventstack.extentreports.Status;

import appium.pages.SumPage;
import appium.utilities.ExtentReportConfiguration;

public class CalcSumNumberTest extends BaseTest {

	private SumPage _sumPatge;
	
	public CalcSumNumberTest() throws MalformedURLException {
		_sumPatge = new SumPage();
	}
	
	@Test
	public void startParler() {
		_sumPatge.getSumResult();		
		
		ExtentReportConfiguration.getInstance()
		.createTest("Login Test")
		.log(Status.PASS, "Start login test.");
		
		
		
		
		ExtentReportConfiguration
		.getInstance()
		.flush();
	}
}
