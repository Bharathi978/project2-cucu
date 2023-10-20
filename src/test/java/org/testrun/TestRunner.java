package org.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.jvm.repo.JvmReportclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
      glue = "org.stepdefinition", monochrome =true, tags= "@act ",
         plugin= {"html:bharathi" ,
        		 "junit:Junitreport\\bharathi.xml", "json:Json\\Fbreport.json" ,
        		 "rerun:C:\\Users\\Bharathi\\eclipse-workspace\\Mavencucum\\src\\test\\resources\\failed.txt"})


public class TestRunner {
//	
//	@AfterClass
//	public static void Report() {
//		 JvmReportclass.repo("C:\\Users\\Bharathi\\eclipse-workspace\\Mavencucum\\Json\\Fbreport.json");
//	}

	
	
	
}
