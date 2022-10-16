package com.pommanagerobject;

import org.openqa.selenium.WebDriver;

import com.pommodel.Pomlogout;

public class Logoutobject {
	public WebDriver driver;
	private Pomlogout objectlogin;
	
	public Logoutobject (WebDriver driver2) {
		this.driver=driver2;
	}

	public Pomlogout getInstancelogout() {
	if(objectlogin==null) {
		objectlogin = new Pomlogout(driver);

	}
		
		return objectlogin;
	}

	

}
