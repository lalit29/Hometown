package com.hometown.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class PaymentPage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),\"Net Banking\")]")
	WebElement netBankingLink;
	
	@FindBy(xpath="//span[contains(text(),\"Credit Card\")]")
	WebElement creditCardLink;
	
	@FindBy(xpath="//span[contains(text(),\"Debit Card\")]")
	WebElement debitCardLink;
	
	@FindBy(xpath="//span[starts-with(text(),\"EMI\")]")
	WebElement EMILink;
	
	@FindBy(xpath="//span[starts-with(text(),\"Wallet\")]")
	WebElement WallletLink;
	
	@FindBy(xpath="//input[@id=\"wallet_Payu\"]")
	WebElement walletPayULink;
	
	@FindBy(xpath="//input[@id=\"wallet_Mobikwik\"]")
	WebElement walletMobikwikULink;
	
	@FindBy(xpath="//button[contains(text(),\" PLACE ORDER \")]")
	WebElement placeOrderLink;
	
	@FindBy(xpath="//input[@value=\"ICIB\"]")
	WebElement ICICIBank;
	
	//initializing
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public NetBankingUsingICICIBankPage placingOrderbyNetBankingUsingICICIBank() {
		netBankingLink.click();
		ICICIBank.click();
		placeOrderLink.click();
		return new NetBankingUsingICICIBankPage();
		
	}
	
	public NetBankingUsingICICIBankPage placingOrderbyDebitCard() {
		netBankingLink.click();
		ICICIBank.click();
		placeOrderLink.click();
		return new NetBankingUsingICICIBankPage();
		
	}
	
	
	
}
