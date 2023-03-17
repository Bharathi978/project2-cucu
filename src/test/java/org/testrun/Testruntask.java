package org.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.jvm.repo.JvmReportclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//resources",glue = "org.stepdefinition",
   monochrome = true,tags =" @Data" , plugin = {"html: allReports\\HtmlReport",
		   "json:allReports\\jsonReport\\fb.json",
		   "junit:allReports\\junitReport\\junit.xml",
		   "rerun:"})




public class Testruntask {

	@AfterClass
	public static void repoForJvm() {
		JvmReportclass.repo("C:\\Users\\Bharathi\\eclipse-workspace\\Mavencucum\\allReports\\jsonReport\\fb.json");

	}
	
}
