package org.pojas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClasscucum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class datapojo extends BaseClasscucum {

	public datapojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name= "pass")
	private WebElement pass;

	
	@FindBy(name= "login")
	private WebElement	 logins;


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogins() {
		return logins;
	}	
	
	
		
	}
