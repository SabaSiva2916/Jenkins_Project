package org.test;

import org.base.ReportingClassesss;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Sample.feature" }, glue = { "org.stepdef" }, plugin = { "pretty",
		"json:C:\\Users\\sabas\\eclipse-workspace\\SampleCucumberProject\\target\\s.json" },monochrome=true)

public class TestRunner {

	@AfterClass
	public static void aftClas() {
		ReportingClassesss
				.getReports("C:\\Users\\sabas\\eclipse-workspace\\SampleCucumberProject\\target\\s.json");
	}

}
