package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class OrderReviewPage extends TestBase {
	
	@FindBy(xpath="//button[@id='checkoutBtn']")
	WebElement checkOutLink;
	
	//initializing
	
	public OrderReviewPage() {
		PageFactory.initElements(driver, this);
	}
	
  //Actions
	public PaymentPage clickOnCheckoutLink() {
		checkOutLink.click();
		return new PaymentPage();
	}
}
