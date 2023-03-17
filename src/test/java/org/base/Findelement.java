package org.base;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelement  {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver k = new ChromeDriver();
		
		k.manage().window().maximize();
		k.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		k.get("https://www.facebook.com/");
		
		WebElement element = k.findElement(By.xpath("//a[text()='Create new account']"));
				
	     element.click();
		
	     
	     WebElement mon = k.findElement(By.xpath("//select[@title='Month']"));
     List<WebElement> all = mon.findElements(By.tagName("option"));
	     for (WebElement itr : all) {
		System.out.println(itr.getText());		}
	     
	     
	     List<WebElement> data = k.findElements(By.tagName("option"));
	     for (WebElement s : data) {
			System.out.println(s.getText());
		}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}
		
	}

