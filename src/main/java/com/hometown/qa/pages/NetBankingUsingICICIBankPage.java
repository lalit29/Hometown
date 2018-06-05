package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class NetBankingUsingICICIBankPage extends TestBase {
	
	@FindBy(xpath="//img[@alt=\"Future bank Logo\"]")
	WebElement ICICILogo;
	
	//initializing 
	public NetBankingUsingICICIBankPage() {
		PageFactory.initElements(driver, this);
	}
   //Actions
	public boolean validateICICILogo() {
		return ICICILogo.isDisplayed();
	}
}
