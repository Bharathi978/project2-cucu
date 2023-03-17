package org.pojas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.BaseClasscucum;

public class Poja5 extends BaseClasscucum {
	
	public Poja5() {
	
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	
	private WebElement txtpassword;

	public WebElement getTxtpassword() {
		return txtpassword;
	}
	
	
	
	
	@FindBy(id="login")
	private WebElement cliklogin;

	public WebElement getCliklogin() {
		return cliklogin;
	}
	
	@FindBy(name="location")
	private WebElement locat;

	public WebElement getLocat() {
		return locat;
	}
	
	@FindBy(xpath="//option[@value='New York']")
	private WebElement city;

	public WebElement getCity() {
		return city;
	}
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	
	
	@FindBy(xpath="//option[@value='Hotel Sunshine']")
	
	private WebElement sun;

	public WebElement getSun() {
		return sun;
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//input[@name='radiobutton_2']")
	
	private WebElement button;
	
	
	@FindBy(xpath="//input[@name='continue']")
	
	private WebElement continu;

	public WebElement getButton() {
		return button;
	}

	public WebElement getContinu() {
		return continu;
	}
	
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement name;
	@FindBy(xpath="//input[@name='last_name']") 
	
	private WebElement lastname;

	public WebElement getName() {
		return name;
	}

	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement add;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cc;

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCc() {
		return cc;
	}
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cctype;
	
	
	@FindBy(xpath="//option[@value='MAST']")
	private WebElement mast;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement month;

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getMast() {
		return mast;
	}

	public WebElement getMonth() {
		return month;
	}
	
	@FindBy(xpath="//option[@value='7']")
	private WebElement value;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year;
	
	@FindBy(xpath="//option[@value='2022']")
	private WebElement yrcode;

	public WebElement getValue() {
		return value;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getYrcode() {
		return yrcode;
	}
	
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement ccvv;
	
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement butt;

	public WebElement getCcvv() {
		return ccvv;
	}

	public WebElement getButt() {
		return butt;
	}
	
	
	@FindBy(xpath="//input[contains(@name,'order_no')]")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

