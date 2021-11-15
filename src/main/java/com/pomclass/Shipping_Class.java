package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Class {
	private WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement shipping;
	
	public Shipping_Class (WebDriver Ship) {
	   	this.driver = Ship;
	   	
	   	PageFactory.initElements(driver, this);
	}

	public WebElement getShipping() {
		return shipping;
	}
	
	

}
