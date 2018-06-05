package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class ForgotPasswordPage extends TestBase{
	
	@FindBy(xpath="//input[@id=\"ForgotPasswordForm_email\"]")
	WebElement forgotPasswordTextBox;
	
	@FindBy(xpath="//button[@id=\"send\"]")
	WebElement submitBtn;
	
	@FindBy(xpath="//div[@class=\"pas\"]")
	WebElement forgotPasswordText;
	
	public ForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateForgotPassword(String un) {
		
		forgotPasswordTextBox.sendKeys(un);
		submitBtn.click();
		return forgotPasswordText.getText();
	}
}
