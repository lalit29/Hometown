package com.hometown.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hometown.qa.base.TestBase;
import com.hometown.qa.pages.AddToCartPage;
import com.hometown.qa.pages.BookNowPage;
import com.hometown.qa.pages.CheckoutPage;
import com.hometown.qa.pages.EmailOrLoginPage;
import com.hometown.qa.pages.HomePage;
import com.hometown.qa.pages.OrderReviewPage;
import com.hometown.qa.pages.PaymentPage;
import com.hometown.qa.pages.SearchResultsPage;
import com.hometown.qa.pages.ShippingAddressPage;

public class CheckoutUsingICICINetBankingTest extends TestBase{
	
	HomePage homePage;
	SearchResultsPage searchResultsPage;
	BookNowPage bknowPage;                                            
	AddToCartPage adToCart;
	CheckoutPage checkoutPage;
	EmailOrLoginPage emailLoginPage;
	ShippingAddressPage shippingAddressPage;
	OrderReviewPage orPage;
	PaymentPage paymentPage;
	
	
	
	public CheckoutUsingICICINetBankingTest() {
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
		emailLoginPage = new EmailOrLoginPage();
		shippingAddressPage= new ShippingAddressPage();
		orPage=new OrderReviewPage();
		paymentPage=new PaymentPage();

		
		
	}
	
	@Test(priority=1)
	public void checkOut() throws InterruptedException {
		searchResultsPage =homePage.verifySearchTextBox();
		bknowPage =searchResultsPage.clickOnProduct();
		adToCart =bknowPage.clickBookNowLink();
		
		checkoutPage=adToCart.clickOnProceedToCheckout();
		emailLoginPage=checkoutPage.clickOnContinueCheckoutLink();
		
		shippingAddressPage=emailLoginPage.enterEmailIdAndCheckout(prop.getProperty("username"));
		orPage=shippingAddressPage.enterShiipingDetailsForm();
		paymentPage=orPage.clickOnCheckoutLink();
		paymentPage.placingOrderbyNetBankingUsingICICIBank();
	}
	
	

	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}



}
