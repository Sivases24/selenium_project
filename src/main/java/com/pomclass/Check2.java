package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check2 {
	private WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement Checkout2;
	
	public Check2 (WebDriver Checks) {
	   	this.driver = Checks;
	   	
	   	PageFactory.initElements(driver, this);
	   	
	}

	public WebElement getCheckout2() {
		return Checkout2;
	}
	

}