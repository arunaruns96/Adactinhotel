package com.pommanagerobject;

import org.openqa.selenium.WebDriver;

import com.pommodel.Pomlogin;

public class loginobject {
	public WebDriver driver;
	private Pomlogin objectlogin;
	
	public loginobject (WebDriver driver2) {
		this.driver=driver2;
	}

	public Pomlogin getInstancelogin() {
	if(objectlogin==null) {
		objectlogin = new Pomlogin(driver);

	}
		
		return objectlogin;
	}

	
}
