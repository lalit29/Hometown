package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory--OR
	

	@FindBy(xpath="//a[@title='Login']")
	WebElement loginlink;
	
	@FindBy(xpath="//input[@name=\"LoginForm[email]\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@name=\"LoginForm[password]\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@value=\"LOGIN\"]")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	WebElement forgot_password;
	
	@FindBy(xpath="//img[@alt='Facebook']")
	WebElement fbLoginbtn;

	@FindBy(xpath="//img[@alt='Google Plus']")
	WebElement gmail_login;
	
	//initializing  the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	
	public HomePage login(String un,String pwd) {
		
		loginlink.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
	
	}
	
	public FBLoginPage loginthroughFB(String un,String pwd) {
		
		loginlink.click();
		fbLoginbtn.click();
		return new FBLoginPage();
	
	}
	
   public GmailLoginPage loginthroughGmail(String un,String pwd) {
		
		loginlink.click();
		gmail_login.click();
		return new GmailLoginPage();
	
	}

   public ForgotPasswordPage forgotPassword(String un,String pwd) {
	
	loginlink.click();
	forgot_password.click();
	return new ForgotPasswordPage();

}

	
	
	
	
	
	

}
