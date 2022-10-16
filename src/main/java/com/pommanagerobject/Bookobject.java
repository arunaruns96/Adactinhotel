package com.pommanagerobject;

import org.openqa.selenium.WebDriver;

import com.pommodel.Pombookhotel;

public class Bookobject {
	public WebDriver driver;
	private Pombookhotel objectlogin;
	
	public Bookobject (WebDriver driver2) {
		this.driver=driver2;
	}

	public Pombookhotel getInstancebookhotel() {
	if(objectlogin==null) {
		objectlogin = new Pombookhotel(driver);

	}
		
		return objectlogin;
	}

	
}



