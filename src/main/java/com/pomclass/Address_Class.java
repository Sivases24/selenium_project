package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Class {
	private WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement Sub;
	
	public Address_Class (WebDriver Submits) {
	   	this.driver = Submits;
	   	
	   	PageFactory.initElements(driver, this);
	   	
	}

	public WebElement getSub() {
		return Sub;
	}
	
	
	

}
