package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay_Class {
	private WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement paybank;
	
	public Pay_Class(WebDriver bank) {
	this.driver = bank;
	   	
	   	PageFactory.initElements(driver, this);
		
}

	
	public WebElement getPaybank() {
		return paybank;
	}
	
	

}
