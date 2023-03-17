package org.pojas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.BaseClasscucum;

public class poja3 extends BaseClasscucum {
	
	public poja3() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='trainer-info'])[11]")
	private WebElement perungudi;

	@FindBy(xpath="//h1[@style='font-size:22px;']")
	private WebElement no1;
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certificate;
	
	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement seleniumpage;
	
	@FindBy(xpath="(//img[@title='Selenium Training in Chennai'])[12]")
	private WebElement test;
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement course;
	
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement java;

	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement corejava;
	
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement printanitha;
	
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement career;
	
	
	@FindBy(xpath="(//a[@title='contact@greenstechnologys.com'])[11]")
	private WebElement mail;
	
	
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement testmonical;
	
	@FindBy(xpath="//div[contains(text(),'I learned QTP')]")
	private WebElement lastline;
	
	@FindBy(xpath="(//a[text()='Contact Us'])[2]")
	private WebElement contact;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public WebElement getContact() {
		return contact;
	}

	public WebElement getLastline() {
		return lastline;
	}

	public WebElement getTestmonical() {
		return testmonical;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getCareer() {
		return career;
	}

	public WebElement getCorejava() {
		return corejava;
	}

	public WebElement getJava() {
		return java;
	}

	public WebElement getCourse() {
		return course;
	}

	public WebElement getPerungudi() {
		return perungudi;
	}

	public WebElement getNo1() {
		return no1;
	}

	public WebElement getCertificate() {
		return certificate;
	}

	public WebElement getSeleniumpage() {
		return seleniumpage;
	}

	public WebElement getTest() {
		return test;
	}

	public WebElement getPrintanitha() {
		return printanitha;
	}

	
	
	
	
	
	

}
