package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Class {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement Dress;
	
	@FindBy(xpath = "(//a[@title='Evening Dresses'])[2]")
	 private WebElement EveDress;
	
    public Dress_Class(WebDriver Dresses) {
    	this.driver = Dresses;
    	
    	PageFactory.initElements(driver, this);
    	
    	
	}

	public WebElement getDress() {
		return Dress;
	}

	public WebElement getEveDress() {
		return EveDress;
	}
    
    
}
