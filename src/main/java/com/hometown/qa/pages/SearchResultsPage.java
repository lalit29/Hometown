package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class SearchResultsPage extends TestBase {
	
	@FindBy(xpath="//div[contains(text(),\"Impression Ganesh Ray Pot Fountain\")]")
	WebElement testProductLink;
	
	//initializing  the page objects
	 public SearchResultsPage() {
				PageFactory.initElements(driver, this);
			}
	 
	 //Actions
	public BookNowPage clickOnProduct() {
		testProductLink.click();
		return new BookNowPage();
	}
	
}
