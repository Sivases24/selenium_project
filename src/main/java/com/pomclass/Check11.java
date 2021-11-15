package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check11 {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement Check;
	
	public Check11 (WebDriver check) {
	   	this.driver = check;
	   	
	   	PageFactory.initElements(driver, this);
	   	
	}

	
	




	public WebElement getCheck() {
		return Check;
	}
	
	
}
