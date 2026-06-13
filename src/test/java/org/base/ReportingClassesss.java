package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClassesss {

	public static void getReports(String json) {
		File file = new File("C:\\Users\\sabas\\eclipse-workspace\\SampleCucumberProject\\target");
		Configuration configuration = new Configuration(file, "jenkisn");
		List<String> li = new ArrayList<String>();
		li.add(json);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();

	}
}
