package com.hometown.qa.util;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import org.openqa.selenium.WebDriver;

import com.hometown.qa.base.TestBase;

public class TestUtil  {

	static WebDriver driver;
	
	public static long PAGE_LOAD_TIMEOUT =20;
	public static long IMPLICIT_WAIT=10;
	
	public void switchToFrame() {
		driver.switchTo().frame("loginiFrame");
	}
	
	
	
}
