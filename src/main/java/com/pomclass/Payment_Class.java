package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Class {
	private WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement Payed;
	
	
	public Payment_Class(WebDriver Submit) {
		this.driver = Submit;
		
	   	PageFactory.initElements(driver, this);

	}


	public WebElement getPayed() {
		return Payed;
	}
	
	
	
}
