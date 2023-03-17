package org.stepdefinition;

import java.util.List;

import org.base.BaseClasscucum;
import org.pojas.Amazonpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonLogin extends BaseClasscucum {
	Amazonpojo a;

	@Given("To launch  browser and maxmize the browser")
	public void to_launch_browser_and_maxmize_the_browser() {
		browserlunch();
		max();
	}

	@When("To lanuch the url of the amazon application")
	public void to_lanuch_the_url_of_the_amazon_application() {
		launchurl(
				"https://www.amazon.in/ap/signin?openid.pape."
				+ "max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amaz"
				+ "on.in%2Fs%3Fk%3Damazon%2Bsign%26i%3Delectronics%26adgrpid"
				+ "%3D59527504272%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiA0JKfBhBIEiwAPh"
				+ "ZXD98aAYpPI8Jjl-YwmPvoV3WCKhkTW2Vna68ZHP1e3gR6eUlAxjuexxoCvB8QAv"
				+ "D_BwE%26hvadid%3D597352931660%26hvdev%3Dc%26hvlocphy%3D9061898%26hvnet"
				+ "w%3Dg%26hvqmt%3Db%26hvrand%3D10306066409622300591%26hvtargid%3Dkwd-365111317"
				+ "397%26hydadcr%3D19941_2255885%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin"
				+ "&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select"
				+ "&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2"
				+ "Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid"
				+ ".net%2Fauth%2F2.0&");

	}

	@When("To pass valid username and emil filed")
	public void to_pass_valid_username_and_emil_filed( DataTable d) {
		a = new Amazonpojo();
	List<String> m = d.asList();
		
		passtext(a.getUsername(), m.get(1));
		getAttributetxt(a.getUsername());
	}

	@When("To click and continue button")
	public void to_click_and_continue_button() {
		clickwebelement(a.getContinuebtn());
	}

	@When("To pass the valid password in password filed")
	public void to_pass_the_valid_password_in_password_filed(DataTable d) {
		List<List<String>> l = d.asLists();
		passtext(a.getPassfield(), l.get(1).get(1));
		getAttributetxt(a.getPassfield());
	}

	@When("To click the sign button")
	public void to_click_the_sign_button() {
		clickwebelement(a.getSignin());
	}

	@Then("close the browser")
	public void close_the_browser() {

	}

}
