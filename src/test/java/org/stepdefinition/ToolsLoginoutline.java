package org.stepdefinition;

import org.base.BaseClasscucum;
import org.pojas.Toolpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ToolsLoginoutline extends BaseClasscucum {
	Toolpojo t;
	
	@Given("user has launch the browsers")
	public void user_has_launch_the_browsers() {
		launchurl("https://www.toolsqa.com/selenium-training/#enroll-form");
	}

	@When("user has to the pass the first names{string}")
	public void user_has_to_the_pass_the_first_names(String a) {
		 t = new Toolpojo();
		 
		 passtext(t.getFirst(), a);
	}

	
	@When("user has to the pass the last names{string}")
	public void user_has_to_the_pass_the_last_names(String b) {
	   passtext(t.getLast(), b);
	}

	@When("user has to the pass the email names{string}")
	public void user_has_to_the_pass_the_email_names(String c) {
	   passtext(t.getEmail(), c);
	}

	@When("user has to the pass the mobile numbers{string}")
	public void user_has_to_the_pass_the_mobile_numbers(String d) {
	   passtext(t.getMob(), d);
	}

	@When("user has to the pass the country names")
	public void user_has_to_the_pass_the_country_names() {
	    
	}

	@When("user has to the pass the city names{string}")
	public void user_has_to_the_pass_the_city_names(String e) {
	   passtext(t.getCity(), e);
	}

	@When("user has to the pass the messages{string}")
	public void user_has_to_the_pass_the_messages(String f) {
	  passtext(t.getMessage(), f);
	}

	
	
}
