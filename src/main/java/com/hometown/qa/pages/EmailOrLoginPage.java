package com.hometown.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class EmailOrLoginPage extends TestBase {
	

	@FindBy(xpath="//input[@id=\"OSCLoginForm_email\"]")
	WebElement emailTextBox;
	
	@FindBy(xpath="//div[@class=\"emailInputCon2 clearfix\"][1]")
	WebElement continueWithoutPasswordRadioButton;
	
	@FindBy(xpath="//div[@class=\"emailInputCon2 clearfix\"][2]")
	WebElement continueWithPasswordRadioButton;
	
	@FindBy(xpath="//a[@title=\"Sign in with Facebook\"]")
	WebElement loginWithFB;
	
	@FindBy(xpath="//button[@id='checkoutBtn']")
	WebElement checkOutLink;
	
	public EmailOrLoginPage() {
		PageFactory.initElements(driver, this);
	}
 
public ShippingAddressPage enterEmailIdAndCheckout (String un) throws InterruptedException {
	  
	Thread.sleep(5000);
	  emailTextBox.sendKeys(un);
	  checkOutLink.click();
	  return new ShippingAddressPage();

	   
	 
	   
	   
	  
}
}
