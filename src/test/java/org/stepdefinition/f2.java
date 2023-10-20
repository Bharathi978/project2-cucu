package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClasscucum;
import org.pojas.loginpojo;

import cucumber.api.java.en.When;

public class f2  extends BaseClasscucum{
  loginpojo l ;
	
	// @mass
	@When("user has to load the FaceBook Applicatios")
	public void user_has_to_load_the_FaceBook_Applicatios() {
		launchurl("https://www.facebook.com/");
	}

	@When("user has to pass the invalid username in email fiels")
	public void user_has_to_pass_the_invalid_username_in_email_fiels(io.cucumber.datatable.DataTable h) {
		 l = new loginpojo();
		 List<Map<String, String>> g = h.asMaps();
		 passtext(l.getEmailtex(), g.get(1).get("emailone"));
		 getAttributetxt(l.getEmailtex());
	}

	@When("user has to pass the invalid password in password fiels")
	public void user_has_to_pass_the_invalid_password_in_password_fiels(io.cucumber.datatable.DataTable y) {
	    List<Map<String, String>> f = y.asMaps();
	    passtext(l.getPasstex(), f.get(1).get("passthree"));
	    getAttributetxt(l.getPasstex());
	}

	@When("user has to click the login butto")
	public void user_has_to_click_the_login_butto() {
	   //clickwebelement(l.getLogin());
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
