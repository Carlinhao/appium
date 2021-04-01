package appium.pages;

import java.net.MalformedURLException;

import appium.utilities.ClickBtnHelper;

public class SumPage extends ElementsPageObjects {

	public SumPage() throws MalformedURLException {
		super();
	}

	public void getSumResult() {
		try {
			ClickBtnHelper.clickBtn(btnCalculator);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
