package org.pojas;

import org.base.BaseClasscucum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Toolpojo extends BaseClasscucum {
	
	
 public Toolpojo() {
	PageFactory.initElements(driver, this);
}
 
 @FindBy(id="first-name")
 private WebElement first;
 
 @FindBy(id="last-name")
 private WebElement last;
 
 
 @FindBy(id="email")
 private WebElement email;
 
 
 
 @FindBy(id="mobile")
 private WebElement mob;
 
 
 
 @FindBy(id="country")
 private WebElement country;
 
 @FindBy(id="city")
 private WebElement city;
 
 
 @FindBy(id="message")
 private WebElement message;

 
 

public WebElement getFirst() {
	return first;
}


public WebElement getLast() {
	return last;
}


public WebElement getEmail() {
	return email;
}


public WebElement getMob() {
	return mob;
}


public WebElement getCountry() {
	return country;
}


public WebElement getCity() {
	return city;
}


public WebElement getMessage() {
	return message;
}
 
 
 
 
}
