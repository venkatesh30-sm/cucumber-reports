package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",
dryRun=false,plugin="rerun:rerun/failed_scenarios.txt")
public class TestRunner {
	

}
