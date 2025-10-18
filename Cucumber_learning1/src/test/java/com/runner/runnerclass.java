package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featuress", glue = {
		"cucumberSDproject" }, monochrome = true, plugin = { "pretty", "html:Reports/HTMLReports" }, dryRun = true, // now
																													// it
																													// will
																													// run
																													// scenarios
																													// and
																													// generate
																													// reports
		tags = "@smoketest and not @sanitytest")

public class runnerclass {

}
