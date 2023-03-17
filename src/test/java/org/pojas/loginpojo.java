package org.pojas;

import org.base.BaseClasscucum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpojo extends BaseClasscucum {

	public loginpojo() {
	
		PageFactory.initElements(driver, this);
		
				
		
	}
	
	@FindBy(id= "email")
	private  WebElement emailtex;
	
	@FindBy(name= "pass")
	private WebElement passtex;

	
	@FindBy(name= "login")
	private WebElement	 login;	
	
	
	
	
	
	
	

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmailtex() {
		return emailtex;
	}

	public WebElement getPasstex() {
		return passtex;
	}
	
	

	
	
}
