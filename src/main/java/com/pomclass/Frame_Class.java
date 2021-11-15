package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame_Class {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement Frame;
	
	@FindBy(xpath = "//i[@class= 'icon-plus']")
	private WebElement icon;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement sizes;
	
	@FindBy(xpath = "//a[@id='color_24']")
	private WebElement Color;
	
   @FindBy(xpath = "//button[@name='Submit']")
   private WebElement Submit;
   
   public Frame_Class (WebDriver frames) {
   	this.driver = frames;
   	
   	PageFactory.initElements(driver, this);
   	
   }

public WebElement getFrame() {
	return Frame;
}

public WebElement getIcon() {
	return icon;
}

public WebElement getSizes() {
	return sizes;
}

public WebElement getColor() {
	return Color;
}

public WebElement getSubmit() {
	return Submit;
}
   
   
}
