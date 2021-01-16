package appium.tests;

import org.junit.Test;

import com.aventstack.extentreports.Status;
import appium.utilities.ExtentReportConfiguration;

public class LoginTest extends BaseTest {

	@Test
	public void startParler() {
		ExtentReportConfiguration.getInstance()
		.createTest("Login Test")
		.log(Status.PASS, "Start login test.");
		
		ExtentReportConfiguration
		.getInstance()
		.flush();
	}
}
