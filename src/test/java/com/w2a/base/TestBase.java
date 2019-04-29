package com.w2a.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		
	}

}
