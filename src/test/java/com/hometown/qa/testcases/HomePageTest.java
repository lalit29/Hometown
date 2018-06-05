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
import com.hometown.qa.pages.HomePage;
import com.hometown.qa.pages.LoginPage;
import com.hometown.qa.pages.SearchResultsPage;



public class HomePageTest extends TestBase {
	
	HomePage homePage;
	SearchResultsPage searchResultsPage;
	BookNowPage bknowPage;
	AddToCartPage adToCart;
	CheckoutPage checkoutPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
		homePage=new HomePage();
		searchResultsPage =new SearchResultsPage();
		bknowPage= new BookNowPage();
		adToCart=new AddToCartPage();
		checkoutPage=new CheckoutPage();

		
		
	}
	
	@Test(priority=1)
	public void htLogoImageTest() {
		boolean flag= homePage.validateHTLogo();
	    Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=3)
	public void signUpForAlreadyRegisteredEmailTest() {
		String actual=homePage.verifySignUpForAlreadyRegistered(prop.getProperty("username"), prop.getProperty("password"));
	
		assertEquals(actual, "Email 'lalittestinght@gmail.com' is already registered with us. Do you want to retrieve your password?");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
