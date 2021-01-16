package appium.tests;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import appium.base.AppiumStart;

public class BaseTest {

	@BeforeClass
	public static void setUp() throws MalformedURLException {
		AppiumStart.androidDriver();
	}
	
	@AfterClass
	public static void tearDown() throws MalformedURLException {
		AppiumStart.androidDriver().quit();
	}
}
