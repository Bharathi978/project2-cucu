package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClasscucum;
import org.junit.Assert;
import org.pojas.datapojo;

import cucumber.api.java.en.When;

public class f3 extends  BaseClasscucum{
	 datapojo d;
	 
	
	
	@When("user has to load the FaceBook Applicationsd")
	public void user_has_to_load_the_FaceBook_Applicationsd() {
	    
	    launchurl("https://www.facebook.com/");
	}

	@When("user has to pass the invalid username in email fieldsd")
	public void user_has_to_pass_the_invalid_username_in_email_fieldsd() throws IOException  {
		
		
	   d = new datapojo();
	    
		
	    passtext(d.getEmail(),excelRead("C:\\Users\\Bharathi\\eclipse-workspace\\Mavencucum\\excel\\quest5.xlsx", "adatin", 0, 0));
	}
	@When("user has to pass the invalid password in password fieldsd")
	public void user_has_to_pass_the_invalid_password_in_password_fieldsd() throws IOException {
		Assert.assertTrue(false);
	    passtext(d.getPass(),excelRead("C:\\Users\\Bharathi\\eclipse-workspace\\Mavencucum\\excel\\quest5.xlsx", "adatin", 1, 0));
	}

	@When("user has to click the login buttonsd")
	public void user_has_to_click_the_login_buttonsd() {
	    clickwebelement(d.getLogins());
	}



	
	

}
