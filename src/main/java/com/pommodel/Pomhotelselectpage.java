package com.pommodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomhotelselectpage {
public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id = "continue")
	private WebElement continuebt;
	
	public Pomhotelselectpage(WebDriver confirm) {
		this.driver = confirm;
		PageFactory.initElements(driver, this);
	}

	public WebElement getradiobutton_0(){
		return radiobutton_0;
	}

	public WebElement getcontinue() {
		return continuebt;
	}

	
	

}
