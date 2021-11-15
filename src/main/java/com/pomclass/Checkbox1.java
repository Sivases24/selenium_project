package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox1 {
	private WebDriver driver;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement box;
	
	public Checkbox1 (WebDriver checkbox) {
	   	this.driver = checkbox;
	   	
	   	PageFactory.initElements(driver, this);
	}

	
	

	public WebElement getBox() {
		return box;
	}
	
	
}
