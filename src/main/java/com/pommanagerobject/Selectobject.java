package com.pommanagerobject;

import org.openqa.selenium.WebDriver;

import com.pommodel.Pomhotelselectpage;

public class Selectobject {
	public WebDriver driver;
	private  Pomhotelselectpage objectlogin;
	
	public Selectobject (WebDriver driver2) {
		this.driver=driver2;
	}

	public Pomhotelselectpage getInstanceselect() {
	if(objectlogin==null) {
		objectlogin = new Pomhotelselectpage(driver);

	}
		
		return objectlogin;
	}

	
}



