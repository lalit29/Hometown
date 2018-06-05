package com.hometown.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hometown.qa.base.TestBase;

public class ShippingAddressPage extends TestBase{

	@FindBy(xpath="//input[@id=\"ShippingAddressForm_first_name\"]")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id=\"ShippingAddressForm_last_name\"]")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id=\"ShippingAddressForm_phone\"]")
	WebElement mobileNo;
	
	@FindBy(xpath="//input[@id=\"ShippingAddressForm_address1\"]")
	WebElement address;
	
	@FindBy(xpath="//input[@id=\"ShippingAddressForm_postcode\"]")
	WebElement pincode;
	
	@FindBy(xpath="//input[@id=\"ShippingAddressForm_city\"]")
	WebElement city;
	
	@FindBy(xpath="//button[@id=\"js_btn_reg_detail_sbmit\"]")
	WebElement continueCheckout;
	
	public ShippingAddressPage() {
		PageFactory.initElements(driver, this);
	}
 
public OrderReviewPage enterShiipingDetailsForm() {
	 firstName.clear();
	   firstName.sendKeys("Test");
	   lastName.clear();
	   lastName.sendKeys("Lalit");
	   mobileNo.clear();
	   mobileNo.sendKeys("7776948392");
	   address.clear();
	   address.sendKeys("Vasai");
	   pincode.clear();
	   pincode.sendKeys("401202");
	 
	   city.clear();
	   city.sendKeys("Thane");
	   Select state=new Select(driver.findElement(By.id("ShippingAddressForm_fk_customer_address_region")));
	   state.selectByVisibleText("Maharashtra");
	   
	   continueCheckout.click();
	   
	   return new OrderReviewPage();
	   
	   
	   
	// TODO Auto-generated method stub
	
}
}
