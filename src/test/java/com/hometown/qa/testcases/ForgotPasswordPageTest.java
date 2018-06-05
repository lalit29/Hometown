package com.hometown.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hometown.qa.base.TestBase;
import com.hometown.qa.pages.AddToCartPage;
import com.hometown.qa.pages.BookNowPage;
import com.hometown.qa.pages.CheckoutPage;
import com.hometown.qa.pages.ForgotPasswordPage;
import com.hometown.qa.pages.HomePage;
import com.hometown.qa.pages.SearchResultsPage;

public class ForgotPasswordPageTest extends TestBase {
	
	HomePage homePage;
	ForgotPasswordPage forgotPwdPage;
	
	public ForgotPasswordPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		homePage=new HomePage();
		forgotPwdPage=new ForgotPasswordPage();
		
		
	}
	
	@Test(priority=1)
	public void forgotPwdTest() {
		homePage.clickOnForgotPasswordInsideSignUp(prop.getProperty("username"), prop.getProperty("password"));
		String actual=forgotPwdPage.validateForgotPassword(prop.getProperty("username"));
		assertEquals(actual, "We have sent you an email with instructions on how to reset your password. Check your inbox and click on the link provided");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
