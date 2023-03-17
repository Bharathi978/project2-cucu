package org.stepdefinition;

import org.base.BaseClasscucum;
import org.openqa.selenium.support.ui.Select;
import org.pojas.Toolpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToolsLogin extends BaseClasscucum {
	 Toolpojo t;
	 
	@Given("user has launch the browser")
	public void user_has_launch_the_browser() {
          
          
	}
	
	@When("user has launch the url Qatool")
	public void user_has_launch_the_url_Qatool() {
        launchurl("https://www.toolsqa.com/selenium-training/#enroll-form");

	}

	@When("user has to the pass the first name")
	public void user_has_to_the_pass_the_first_name() {
	 t = new Toolpojo();
	 
	 passtext(t.getFirst(), "bharathi");
	}

	@When("user has to the pass the last  name")
	public void user_has_to_the_pass_the_last_name() {
	    passtext(t.getLast(), "sharathi");
	}

	@When("user has to the pass the email name")
	public void user_has_to_the_pass_the_email_name() {
	    passtext(t.getEmail(), "sharathi@123");
	}

	@When("user has to the pass the mobile number")
	public void user_has_to_the_pass_the_mobile_number() {
	    passtext(t.getMob(), "9789675322");
	}

	@When("user has to the pass the country name")
	public void user_has_to_the_pass_the_country_name() {
      Select s = new Select(t.getCountry());
      s.selectByIndex(3);

	}

	@When("user has to the pass the city name")
	public void user_has_to_the_pass_the_city_name() {
	   passtext(t.getCity(), "tirunelveli");
	}

	@When("user has to the pass the message")
	public void user_has_to_the_pass_the_message() {
	   passtext(t.getMessage(), "checked verify");
	}

	




}
