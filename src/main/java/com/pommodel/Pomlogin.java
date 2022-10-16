package com.pommodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomlogin {
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement mailid;
	
	@FindBy(id= "password")
	private WebElement passkey;
	
	@FindBy(id = "login")
	private WebElement clickon;
	
	public Pomlogin(WebDriver log) {
		this.driver = log;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMailid() {
		return mailid;
	}

	public WebElement getPasskey() {
		return passkey;
	}

	public WebElement getClickon() {
		return clickon;
	}
}
