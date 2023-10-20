package org.stepdefinition;

import org.base.BaseClasscucum;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClasscucum {
	
	
    @Before(order=10)
	public void precondision1 () {
		
		max();
		System.out.println("2 window maxmize");
       
	}
    @Before(order=5)
    public void precondision2 () {
		browserlunch();
	//System.out.println("1 browser Launch");
}
	
	
	
	// scenario it will execute is presented in all feature file
	
	@After(order=2)
	public void postcondision1() {
	
		System.out.println("5 close the browser");
		
	}
	
	@After(order=6)
	public void postcondision2( Scenario s) {
	 if (s.isFailed()) {
		
		 TakesScreenshot ts =  (TakesScreenshot)driver;
		 byte[] scr = ts.getScreenshotAs(OutputType.BYTES);		 
		 s.embed(scr, "image/png");
		 System.out.println("Failed:" + s.getName());
		 
	}
	
	
	
	}
	
	
	
}
