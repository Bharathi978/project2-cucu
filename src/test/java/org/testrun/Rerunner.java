package org.testrun;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.jvm.repo.JvmReportclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\failed.txt",
   glue = "org.stepdefinition",
   monochrome = true,
   tags= "@Data",
   plugin=  {"rerun:C:\\Users\\Bharathi\\eclipse-workspace\\Mavencucum\\src\\test\\resources\\failed.txt"})

public class Rerunner {

	
	@AfterClass
	public static void PostReport() {
		JvmReportclass.repo("C:\\Users\\Bharathi\\eclipse-workspace\\Mavencucum\\Json\\Fbreport.json");

	}
	
	
	
	
}
