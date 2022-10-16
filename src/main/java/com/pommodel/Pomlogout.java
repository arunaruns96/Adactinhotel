package com.pommodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomlogout {
	public WebDriver driver;
	
	@FindBy(name = "logout")
	private WebElement logout;

	public Pomlogout(WebDriver logout) {
		this.driver = logout;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

	
}
