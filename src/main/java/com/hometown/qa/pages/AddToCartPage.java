package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class AddToCartPage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),\"Proceed to Checkout\")]")
	WebElement proceedToCheckoutLink;
	
	//initializing  the page objects
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public CheckoutPage clickOnProceedToCheckout() {
		proceedToCheckoutLink.click();
		return new CheckoutPage();
	}

}
