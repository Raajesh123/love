package org.dem;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",glue="org.emp",
dryRun=false,tags= {"@Smoke"},monochrome = true, plugin= {"pretty",
		"json:C:\\Users\\Rajesh\\eclipse-workspace\\Cucumber2\\All Report\\Json Report\\raj.json"})
public class Testrunner {
	public static void tc1() {
		JvmReport.getjvmreport("All Report\\Json Report\\raj.json");
	}
}
