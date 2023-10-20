package org.pojas;

import org.base.BaseClasscucum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOAdactinHotel extends BaseClasscucum {

	public POJOAdactinHotel() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement user;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement submitbtn;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//option[text()='Melbourne']")
	private WebElement selelocation;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement baby;
	
	@FindBy(xpath="(//option[text()='3 - Three'])[3]")
	private WebElement babycount;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbtn2;
	
	@FindBy(xpath="//input[@id='radiobutton_2']")
	private WebElement roomsele;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebtn;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cardno;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardtype;
	
	@FindBy(xpath="//option[text()='VISA']")
	private WebElement cardtypesele;
	
	@FindBy(xpath="//option[text()='- Select Month -']")
	private WebElement month;
	
	@FindBy(xpath="//option[text()='June']")
	private WebElement monthsele;
	
	@FindBy(xpath="//option[text()='- Select Year -']")
	private WebElement year;
	
	@FindBy(xpath="//option[text()='2022']")
	private WebElement yearsele;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement ccvno;
	
	@FindBy(xpath="//td//input[contains(@name,'book_now')]")
	private WebElement booknow;
	
	@FindBy(xpath="//td//input[contains(@name,'order_no')]")
	private WebElement orderno;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getSelelocation() {
		return selelocation;
	}

	public WebElement getBaby() {
		return baby;
	}

	public WebElement getBabycount() {
		return babycount;
	}

	public WebElement getSubmitbtn2() {
		return submitbtn2;
	}

	public WebElement getRoomsele() {
		return roomsele;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardtypesele() {
		return cardtypesele;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getMonthsele() {
		return monthsele;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getYearsele() {
		return yearsele;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getOrderno() {
		return orderno;
	}
	


	
	
}
