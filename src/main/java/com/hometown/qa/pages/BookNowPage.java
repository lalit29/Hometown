package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class BookNowPage extends TestBase {
	
	@FindBy(xpath="//button[@id=\"AddToCart\"]")
	WebElement bookNowLink;
	
	//initializing  the page objects
	 public BookNowPage() {
				PageFactory.initElements(driver, this);
			}
			
	//Actions
	 
	 public AddToCartPage clickBookNowLink() {
		 bookNowLink.click();
		 return new AddToCartPage();
	 }
			

}
