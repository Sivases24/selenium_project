package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Class {
	
	public WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement user;
	
	@FindBy(id = "passwd")
    private WebElement pass;
	
	@FindBy(id = "SubmitLogin")
	private WebElement log;
	

	public Login_Class(WebDriver lg) {
   this.driver = lg;
		
		PageFactory.initElements(driver, this); 
		
	}


	public WebElement getUser() {
		return user;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLog() {
		return log;
	}		
	
	
	

}
