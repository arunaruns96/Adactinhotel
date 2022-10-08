package com.Mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runnercls_Adactin extends Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = Browserlaunch("chrome");

		EnterURL("https://adactinhotelapp.com/index.php");
		
		WebElement mailid = driver.findElement(By.id("username"));
		Sendinput(mailid, "9094307735");

		WebElement passkey =driver.findElement(By.id("password"));
		Sendinput(passkey,"9094307735");

		WebElement clickon =driver.findElement(By.id("login"));
		Clickbutton(clickon);

		WebElement selectbyindexs = driver.findElement(By.name("location"));
		Selectionsindex(selectbyindexs, 5);
	

	}

}
