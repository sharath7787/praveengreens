package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Login.feature" }, glue = { "org.detail" }, monochrome = true,dryRun=false)
public class TestRunner {

}
