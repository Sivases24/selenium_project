package com.SDPclass;

import java.awt.Checkbox;

import org.openqa.selenium.WebDriver;

import com.pomclass.Address_Class;
import com.pomclass.Check11;
import com.pomclass.Check2;
import com.pomclass.Checkbox1;
import com.pomclass.Dress_Class;
import com.pomclass.Frame_Class;
import com.pomclass.Home_page;
import com.pomclass.Login_Class;
import com.pomclass.Pay_Class;
import com.pomclass.Payment_Class;
import com.pomclass.Print_class;
import com.pomclass.Shipping_Class;


public class Singleton_design_Pattern {

	public WebDriver driver;
	
	private Home_page hp;
	private Login_Class login;
	private Dress_Class Dresscls;
	private Print_class printdresses;
	private Frame_Class Frames;
	private Check11 checkout;
	private Check2 Checkout2;
	private Address_Class Addcls;
	private Checkbox1 boxcls;
	private Shipping_Class Shipping;
	private Pay_Class Paycls;
	private Payment_Class Payedcls;
	
	
	
	

    public Singleton_design_Pattern (WebDriver driver1) {
    	this.driver = driver1;
    }
	
	public Home_page getInstanceHp() {
	 hp = new Home_page(driver);
		return hp;
	}

	public Login_Class getInstanceLogin() {
	 login = new Login_Class(driver);
		return login;
	}

	public Dress_Class getInstanceDresscls() {
		Dresscls = new Dress_Class(driver);
		return Dresscls;
	}

	public Print_class getInstancePrintdresses() {
		printdresses = new Print_class(driver);
		return printdresses;
	}

	public Frame_Class getInstanceFrames() {
		Frames = new Frame_Class(driver);
		return Frames;
	}

	public Check11 getInstanceCheckout() {
		 checkout = new Check11(driver);
		return checkout;
	}

	public Check2 getInstanceCheckout2() {
		Checkout2 = new Check2(driver);
		return Checkout2;
	}

	public Address_Class getInstanceAddcls() {
		Addcls = new Address_Class(driver);
		return Addcls;
	}

	public Checkbox1 getInstanceBoxcls() {
		boxcls  = new Checkbox1(driver);
		return boxcls;
	}

	public Shipping_Class getInstanceShipping() {
		Shipping = new Shipping_Class(driver);
		return Shipping;
	}

	public Pay_Class getInstancePaycls() {
		Paycls = new Pay_Class(driver);
		return Paycls;
	}

	public Payment_Class getInstacePayedcls() {
		Payedcls = new Payment_Class(driver);
		return Payedcls;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
