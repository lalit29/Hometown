package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class CheckoutPage extends TestBase{
	
	@FindBy(xpath="//button[@id='checkoutBtn']")
	WebElement checkOutLink;
	
	//initializing
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public EmailOrLoginPage clickOnContinueCheckoutLink() {
		checkOutLink.click();
		return new EmailOrLoginPage();
	}

}
