package com.properties;

import java.io.IOException;

public class Filereader {
	private Filereader() {

	}
public static Filereader getInstanceFileread() {
	Filereader file = new Filereader();
	return file;
	
}
public  Configurationfile getConfigs() throws IOException {
	Configurationfile config=new Configurationfile();
	return config;

}
}
