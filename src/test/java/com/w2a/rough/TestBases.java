package com.w2a.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBases {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties Config = new Properties();
		Properties OR = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
	    Config.load(fis);
	     fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
	    OR.load(fis);
	    System.out.println((Config.getProperty("browser")));
	    System.out.println((OR.getProperty("BMgrLogin")));

	}

}
