package com.Mavenproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.pommanagerobject.Bookobject;
import com.pommanagerobject.Logoutobject;
import com.pommanagerobject.Selectobject;
import com.pommanagerobject.homeobject;
import com.pommanagerobject.loginobject;
import com.properties.Filereader;

public class Runnercls_Adactin extends Baseclass {
	public static WebDriver driver = Baseclass.Browserlaunch("chrome");

	// =============POM Model object=========
	// public static Pomlogin pl = new Pomlogin(driver);
	// public static Pomhome ph = new Pomhome(driver);
	// public static Pomhotelselectpage pomcmf = new Pomhotelselectpage(driver);
	// public static Pombookhotel pombook = new Pombookhotel(driver);
	// public static Pomlogout pomout = new Pomlogout(driver);

	// ============pom object manager ===============
	public static loginobject objlog = new loginobject(driver);
	public static homeobject objhome = new homeobject(driver);
	public static Selectobject objsel = new Selectobject(driver);
	public static Bookobject objbook = new Bookobject(driver);
	public static Logoutobject objout = new Logoutobject(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		String url = Filereader.getInstanceFileread().getConfigs().getUrl();
		EnterURL(url);

		// EnterURL("https://adactinhotelapp.com/index.php");
//LOGIN
		String username = Filereader.getInstanceFileread().getConfigs().getUsername();
		Sendinput(objlog.getInstancelogin().getMailid(), username);

		String password = Filereader.getInstanceFileread().getConfigs().getUsername();
		Sendinput(objlog.getInstancelogin().getPasskey(), password);

		Clickbutton(objlog.getInstancelogin().getClickon());
//HOME
		String location = Filereader.getInstanceFileread().getConfigs().getLocation();
		selectvisibletextfromdrop(objhome.getInstancehome().getLocation(), location);

		String hotel = Filereader.getInstanceFileread().getConfigs().gethotel();
		selectvisibletextfromdrop(objhome.getInstancehome().getHotels(), hotel);

		String roomtype = Filereader.getInstanceFileread().getConfigs().getRoomtype();
		selectvisibletextfromdrop(objhome.getInstancehome().getRoom_type(), roomtype);

		String roomnos = Filereader.getInstanceFileread().getConfigs().getRoomnos();
		selectvisibletextfromdrop(objhome.getInstancehome().getRoom_nos(), roomnos);

		String datein = Filereader.getInstanceFileread().getConfigs().getDatein();
		Sendinput(objhome.getInstancehome().getDatepick_in(), datein);

		String dateout = Filereader.getInstanceFileread().getConfigs().getDateout();
		Sendinput(objhome.getInstancehome().getDatepick_out(), dateout);

		String adultroom = Filereader.getInstanceFileread().getConfigs().getAdultroom();
		selectvisibletextfromdrop(objhome.getInstancehome().getAdult_room(), adultroom);

		String childroom = Filereader.getInstanceFileread().getConfigs().getChildroom();
		selectvisibletextfromdrop(objhome.getInstancehome().getChild_room(), childroom);

		Clickbutton(objhome.getInstancehome().getSubmit());

//HOTELSELECT
		Clickbutton(objsel.getInstanceselect().getradiobutton_0());

		Clickbutton(objsel.getInstanceselect().getcontinue());

//BOOKHOTEL
		String firstname = Filereader.getInstanceFileread().getConfigs().getFirstname();
		Sendinput(objbook.getInstancebookhotel().getFirst_name(), firstname);

		String lastname = Filereader.getInstanceFileread().getConfigs().getLastname();
		Sendinput(objbook.getInstancebookhotel().getLast_name(), lastname);

		String address = Filereader.getInstanceFileread().getConfigs().getAddress();
		Sendinput(objbook.getInstancebookhotel().getAddress(), address);

		String ccnum = Filereader.getInstanceFileread().getConfigs().getCcnum();
		Sendinput(objbook.getInstancebookhotel().getCc_num(), ccnum);

		String cctype = Filereader.getInstanceFileread().getConfigs().getCctype();
		selectvisibletextfromdrop(objbook.getInstancebookhotel().getCc_type(), cctype);

		String ccmonth = Filereader.getInstanceFileread().getConfigs().getCcmonth();
		selectvisibletextfromdrop(objbook.getInstancebookhotel().getCc_exp_month(), ccmonth);

		String ccyear = Filereader.getInstanceFileread().getConfigs().getCcyear();
		selectvisibletextfromdrop(objbook.getInstancebookhotel().getCc_exp_year(), ccyear);

		String cvv = Filereader.getInstanceFileread().getConfigs().getCvv();
		Sendinput(objbook.getInstancebookhotel().getCc_cvv(), cvv);

		Clickbutton(objbook.getInstancebookhotel().getBook_now());
//LOGOUT
		Thread.sleep(15000);
		Clickbutton(objout.getInstancelogout().getLogout());
//close
		Thread.sleep(5000);
		close();
	}
}
