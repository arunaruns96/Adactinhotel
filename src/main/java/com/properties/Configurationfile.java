package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurationfile {
	public static Properties props;
	public   Configurationfile() throws IOException {
		File f = new File("C:\\Users\\AK\\eclipse-workspace\\Mavenproject\\src\\main\\java\\com\\properties\\Adactin.properties");
		FileInputStream fs = new FileInputStream(f);
		props = new Properties();
		props.load(fs);
	}
	
	public  String getUrl() throws IOException {
		
		String url=props.getProperty("url");
		return url;

	}
	
		public  String getUsername() throws IOException {
			String username=props.getProperty("username");
			return username;

		}
		public  String getPassword() throws IOException {
			
			String password=props.getProperty("password");
			return password;

		}
public  String getLocation() throws IOException {
			
			String location=props.getProperty("location");
			return location;

		}
public  String gethotel() throws IOException {
	
	String password=props.getProperty("hotels");
	return password;

}
public  String getRoomtype() throws IOException {
	
	String password=props.getProperty("room_type");
	return password;

}
public  String getRoomnos() throws IOException {
	
	String password=props.getProperty("room_nos");
	return password;

}
public  String getDatein() throws IOException {
	
	String password=props.getProperty("datepick_in");
	return password;

}
public  String getDateout() throws IOException {
	
	String password=props.getProperty("datepick_out");
	return password;

}
public  String getAdultroom() throws IOException {
	
	String password=props.getProperty("adult_room");
	return password;

}
public  String getChildroom() throws IOException {
	
	String password=props.getProperty("child_room");
	return password;

}
public  String getFirstname() throws IOException {
	
	String password=props.getProperty("first_name");
	return password;

}
public  String getLastname() throws IOException {
	
	String password=props.getProperty("last_name");
	return password;

}
public  String getAddress() throws IOException {
	
	String password=props.getProperty("address");
	return password;

}
public  String getCcnum() throws IOException {
	
	String password=props.getProperty("cc_num");
	return password;

}
public  String getCctype() throws IOException {
	
	String password=props.getProperty("cc_type");
	return password;

}
public  String getCcmonth() throws IOException {
	
	String password=props.getProperty("cc_exp_month");
	return password;

}
public  String getCcyear() throws IOException {
	
	String password=props.getProperty("cc_exp_year");
	return password;

}
public  String getCvv() throws IOException {
	
	String password=props.getProperty("cc_cvv");
	return password;

}
	}
	

