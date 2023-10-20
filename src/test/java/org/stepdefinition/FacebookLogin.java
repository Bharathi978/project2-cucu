package org.stepdefinition;

/// One Dimensional Map And Two Dimensional Maps///

import java.util.List;
import java.util.Map;

import org.base.BaseClasscucum;
import org.junit.Assert;
import org.pojas.loginpojo;
import org.testng.AssertJUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookLogin extends BaseClasscucum {

	loginpojo l;
	
      //@key
	
	@Given("user has to load the Browser and Max the Window")
	public void user_has_to_load_the_Browser_and_Max_the_Window() {
		browserlunch();
		max();
	}

	@When("user has to load the FaceBook Application")
	public void user_has_to_load_the_FaceBook_Application() {
		launchurl("https://www.facebook.com/");
	}

	@When("user has to pass the invalid username in email field")
	public void user_has_to_pass_the_invalid_username_in_email_field(DataTable d) {
		l = new loginpojo();
		Map<String, String> m = d.asMap(String.class, String.class);
		
		passtext(l.getEmailtex(), m.get("emailtwo"));
		getAttributetxt(l.getEmailtex());
	}

	@When("user has to pass the invalid password in password field")
	public void user_has_to_pass_the_invalid_password_in_password_field(DataTable d) {
		List<Map<String, String>> h = d.asMaps(String.class, String.class);
		passtext(l.getPasstex(), h.get(1).get("passthree"));
		getAttributetxt(l.getPasstex());
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		
		
		clickwebelement(l.getLogin());
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
		driver.close();
	}

	
	
	
	// 2 outline   tags concept
	
	@Given("to load  browser max  the window")
	public void to_load_browser_max_the_window() {
		browserlunch();
		max();
	}

	@When("to lauch the url o the facebook application")
	public void to_lauch_the_url_o_the_facebook_application() {
		launchurl("https://www.facebook.com/");
	}

	@When("to pass postive and neagative data in {string}email field")
	public void to_pass_postive_and_neagative_data_in_email_field(String em) {
		l = new loginpojo();
	
		passtext(l.getEmailtex(), em);
		//Assert.assertTrue(false);
	}

	@When("to pass postive and negative dat in{string} password field")
	public void to_pass_postive_and_negative_dat_in_password_field(String pass) {
		passtext(l.getPasstex(), pass);
	}

	@When("to click login button")
	public void to_click_login_button() {
		
		clickwebelement(l.getLogin());
	}

	@Then("To close te browser")
	public void to_close_te_browser() {
		//driver.close();
	}

}
