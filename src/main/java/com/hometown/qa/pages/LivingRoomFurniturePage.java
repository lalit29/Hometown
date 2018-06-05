package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class LivingRoomFurniturePage extends TestBase {
	
	public LivingRoomFurniturePage() {
		PageFactory.initElements(driver,this);
	}

	//OR
	@FindBy(xpath="//span[@id=\"sort_by_on_off\"]")
	WebElement sortbydropdown;
	
	@FindBy(xpath="//ul//li//a[contains(text(),\"Price : Low to High\")]")
	WebElement lowToHigh;
	
	//Action
	public String verifyCurrentURL() {
	String url=	driver.getCurrentUrl();
	return url;
	}
	public void verifySortBy() {
		
		sortbydropdown.click();
		Actions actions = new Actions(driver);

		actions.moveToElement(lowToHigh).click().perform();
		
		
	}
}
