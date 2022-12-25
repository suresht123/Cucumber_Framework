package com.amzn.stepdefenition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions( features ="src\\test\\resources\\Features\\mobil.feature",
	                     glue  = "com.amzn.stepdefenition",
	                     plugin ={"html:target","json:target/reports.json"},
	                     monochrome =true,
	                     dryRun=false
//	                     tags={"@mobile"}
	                       )
	public class TestRunner {

	}

