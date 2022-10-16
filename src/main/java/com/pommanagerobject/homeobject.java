package com.pommanagerobject;

import org.openqa.selenium.WebDriver;
import com.pommodel.Pomhome;


public class homeobject {
	public WebDriver driver;
	private Pomhome objectlogin;
	
	public homeobject (WebDriver driver2) {
		this.driver=driver2;
	}

	public Pomhome getInstancehome() {
	if(objectlogin==null) {
		objectlogin = new Pomhome(driver);

	}
		
		return objectlogin;
	}

	
}
