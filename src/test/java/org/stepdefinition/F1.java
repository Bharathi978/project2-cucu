package org.stepdefinition;

import java.util.Map;

import org.base.BaseClasscucum;
import org.pojas.loginpojo;

import cucumber.api.java.en.When;
            /// One Dimensional Map ///
public class F1 extends BaseClasscucum {
	 loginpojo l;
	 
	@When("user has to load the FaceBook Applications")
	public void user_has_to_load_the_FaceBook_Applications() {
	   	 
	   	  launchurl("https://www.facebook.com/");
	   	    
	}

	@When("user has to pass the invalid username in email fields")
	public void user_has_to_pass_the_invalid_username_in_email_fields(io.cucumber.datatable.DataTable g) {
		
		
	 l = new loginpojo();
	  Map<String , String> h = g.asMap(String.class, String.class);
	  passtext(l.getEmailtex(), h.get("emailthree"));
	  getAttributetxt(l.getEmailtex());
	  
	}

	@When("user has to pass the invalid password in password fields")
	public void user_has_to_pass_the_invalid_password_in_password_fields(io.cucumber.datatable.DataTable g) {
		
		
	 Map<Object, Object> r = g.asMap(String.class, String.class);
	 passtext(l.getPasstex(),(String) r.get("pass1"));
	 getAttributetxt(l.getPasstex());
	 
	}

	@When("user has to click the login buttons")
	public void user_has_to_click_the_login_buttons() {
	 clickwebelement(l.getLogin());
	}
}
