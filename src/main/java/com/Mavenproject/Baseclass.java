package com.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;

	public static WebDriver Browserlaunch(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (type.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void EnterURL(String Link) {
		driver.get(Link);
	}

	public static void Sendinput(WebElement textbox, String input) {
		textbox.sendKeys(input);
	}

	public static void Clickbutton(WebElement clickon) {
		clickon.click();
	}
	
	public static void selectvisibletextfromdrop(WebElement textbox, String input) {
		Select selectoption=new Select(textbox);
		selectoption.selectByValue(input);	

	}
	
	public static void close() {
		driver.quit();
		

	}
	
}