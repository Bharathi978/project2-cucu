package org.stepdefinition;

import org.base.BaseClasscucum;
import org.pojas.POJOAdactinHotel;

import cucumber.api.java.en.When;

public class hotel extends BaseClasscucum{

	POJOAdactinHotel p;
	
	@When("To Launch The Url of Adacitin Appln")
	public void to_Launch_The_Url_of_Adacitin_Appln() {
		implicity();
		launchurl("http://adactinhotelapp.com/");
	}

	@When("To Pass The Valid Username and Password")
	public void to_Pass_The_Valid_Username_and_Password() {
		p = new POJOAdactinHotel();
	    passtext(p.getUser(), "SANDAL2098");
	    passtext(p.getPass(), "72E8VJL");
	}

	@When("Check Whether Submit button Click or Not")
	public void check_Whether_Submit_button_Click_or_Not() {
		clickwebelement(p.getSubmitbtn());
	}
	
	@When("the user has to select the location in a particular filed")
	public void the_user_has_to_select_the_location_in_a_particular_filed() {
		clickwebelement(p.getLocation());
		clickwebelement(p.getSelelocation());
		
	}

	@When("the user has to choose how many children in a particular filed and click the search btn")
	public void the_user_has_to_choose_how_many_children_in_a_particular_filed_and_click_the_search_btn() {
		clickwebelement(p.getBaby());
        clickwebelement(p.getBabycount());
        clickwebelement(p.getSubmitbtn2());
	}

	@When("User has to select the hotelroom and cilck the continue btn")
	public void user_has_to_select_the_hotelroom_and_cilck_the_continue_btn() {
		clickwebelement(p.getRoomsele());
		clickwebelement(p.getContinuebtn());
	}

	@When("user has to pass firstname and lastname in particular filed")
	public void user_has_to_pass_firstname_and_lastname_in_particular_filed() {
		passtext(p.getFirstname(), "bharathi");	
		passtext(p.getLastname(), "G");
	}

	@When("user has to give their address in particular filed")
	public void user_has_to_give_their_address_in_particular_filed() {
		passtext(p.getAddress(), "madurai");
	}

	@When("user has to pass the {int}digits credircard number and select the cardtype")
	public void user_has_to_pass_the_digits_credircard_number_and_select_the_cardtype(Integer int1) {
		passtext(p.getCardno(), "9876567832143456");
		clickwebelement(p.getCardtype());
		clickwebelement(p.getCardtypesele());
	}

	@When("user has to pass the expri month&year details in particular filed")
	public void user_has_to_pass_the_expri_month_year_details_in_particular_filed() {
		clickwebelement(p.getMonth());
		clickwebelement(p.getMonthsele());
		clickwebelement(p.getYear());
		clickwebelement(p.getYearsele());
		
	}

	@When("user has to give the ccv number of card and click the booknow btn")
	public void user_has_to_give_the_ccv_number_of_card_and_click_the_booknow_btn() {
		passtext(p.getCcvno(), "858");
		clickwebelement(p.getBooknow());
	}

	@When("user check whether see the order no or not , then orderno print in consloe when order no get")
	public void user_check_whether_see_the_order_no_or_not_then_orderno_print_in_consloe_when_order_no_get() {
		getTxt(p.getOrderno());
	}


	
	
}
