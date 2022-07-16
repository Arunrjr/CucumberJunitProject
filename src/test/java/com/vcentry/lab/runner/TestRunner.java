package com.vcentry.lab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // junit main method
@CucumberOptions (
 features = "src\\test\\resources\\features", // feature file location
glue = {"com.vcentry.lab.stepDefinition"}, // stepdefnition
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },  // for reports
monochrome = true // readable console
,tags = "@sanity"
// ,publish = true
// test
)
public class TestRunner {

}
