package org.pojas;

import org.base.BaseClasscucum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonpojo extends BaseClasscucum {
	 public Amazonpojo() {
	
		 PageFactory.initElements(driver, this);
		 
		 
		 
	}
	 
	 
	@FindBy(id="ap_email") 
	 private WebElement username;
	
	@FindBy(id="continue")
	 private WebElement continuebtn;
	 
	 @FindBy(id="ap_password")
	 private WebElement passfield;
	 
	 @FindBy(id="signInSubmit")
	 private WebElement signin;
	 
	 

	public WebElement getUsername() {
		return username;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getPassfield() {
		return passfield;
	}

	public WebElement getSignin() {
		return signin;
	}
	 
	 
	 
	 
	 
	 
	 
}
