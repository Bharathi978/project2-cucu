package org.stepdefinition;

import org.base.BaseClasscucum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForDb extends BaseClasscucum{
	
	
		public static void main(String[] args) {
			
		
		
		
		browserlunch();
		launchurl("https://www.facebook.com/");
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys(dBDatas("select firstname from bharathi where firstname='Bharathi'", "firstname"));
		driver.findElement(By.name("pass")).sendKeys(dBDatas("select PHONENUMBER from bharathi where PHONENUMBER='12345678'", "PHONENUMBER"));
		

	}
 
}
