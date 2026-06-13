package org.stepdef;

import org.base.BaseClass;
import org.base.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {

	@Before
	public void beforeScenario() {
		String browserName = ConfigReader.getProperty("browser");
		getDriver(browserName);

		String url = ConfigReader.getProperty("url");
		enterUrl(url);
	}

	@After
	public void afterScenario(Scenario s) {
		byte[] screenshot = getScreenshot();
		s.attach(screenshot, ".png", s.getName());

		tearDown();
	}
}
