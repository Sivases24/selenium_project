package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Print_class {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//img[@title = \"Printed Dress\"]")
	private WebElement pdress;
	
	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement qview;
	
	public Print_class(WebDriver printdress) {
    	this.driver = printdress;
    	
    	PageFactory.initElements(driver, this);
}

	public WebElement getPdress() {
		return pdress;
	}

	public WebElement getQview() {
		return qview;
	}
	
	
	
}
