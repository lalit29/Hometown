package com.hometown.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hometown.qa.base.TestBase;

public class HomePage extends TestBase{
	
     	//Page Factory--OR
	
		@FindBy(id="header_logo")
		WebElement logo;
		
		@FindBy(xpath="//input[@id=\"searchInput\"]")
		WebElement searchBox;
		
		@FindBy(xpath="//a[@title='Login']")
		WebElement loginlink;
		
		@FindBy(xpath="//a[@title='Sign up']")
		WebElement signUpLink;
		
		@FindBy(xpath="//input[@name=\"LoginForm[email]\"]")
		WebElement email;
		
		@FindBy(xpath="//input[@name=\"LoginForm[password]\"]")
		WebElement password;
		
		@FindBy(xpath="//input[@id=\"RegistrationForm_email\"]")
		WebElement signUpEmail;
		
		@FindBy(xpath="//input[@id=\"RegistrationForm_password\"]")
		WebElement signUpPassword;
		
		@FindBy(xpath="//input[@value=\"LOGIN\"]")
		WebElement loginbtn;
		
		@FindBy(xpath="//input[@value=\"Submit\"]")
		WebElement signUpbtn;
		
		@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
		WebElement forgot_password;
		
		@FindBy(xpath="//img[@alt='Facebook']")
		WebElement fbLoginbtn;

		@FindBy(xpath="//img[@alt='Google Plus']")
		WebElement gmail_login;
		
		@FindBy(xpath="//div/h3[contains(text(),\"Living Room Furniture\")]")
		WebElement livingRoomFurnitureLink;
		
		@FindBy(xpath="//div[@class=\"s-error emailExit\"]")
		WebElement signUpError;
		
		@FindBy(xpath="//a[contains(text(),'retrieve your password? ')]")
		WebElement retrieveYourpwd;
		
		@FindBy(xpath="//div[@id='weeklyDeal']//a")
		WebElement weeklyDealsDiv;
		
		
		
		
		//initializing  the page objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		
		public boolean validateHTLogo() {
			return logo.isDisplayed();
		}
		
		public void verifyWeeklyDeals() {
			List<WebElement> elementsRoot = driver.findElements(By.xpath("//div[@id='weeklyDeal']//a"));

					for(int i = 0; i < elementsRoot.size(); ++i) {
					     String checkbox = elementsRoot.get(i).getText();
					     System.out.println(checkbox);
					}
		}
		
		public LivingRoomFurniturePage verifyLivingRoomFurnitureLink() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;

			jse.executeScript("scroll(280,609)");
			livingRoomFurnitureLink.click();
			return new LivingRoomFurniturePage();
		}
		public SearchResultsPage verifySearchTextBox() {
			searchBox.sendKeys("460089");
			searchBox.sendKeys(Keys.ENTER);
			return new SearchResultsPage();
			
		}
		public void login(String un,String pwd) {
			
			
			loginlink.click();
			driver.switchTo().frame("loginiFrame");
			email.sendKeys(un);
			password.sendKeys(pwd);
			loginbtn.click();
		}
		
       public String verifySignUpForAlreadyRegistered(String un,String pwd) {
			
			
			signUpLink.click();
			driver.switchTo().frame("signupiFrame");
			signUpEmail.sendKeys(un);
			signUpPassword.sendKeys(pwd);
			signUpbtn.click();
			String errorMessage=signUpError.getText();
			return errorMessage;
		}
		
		public void loginthroughFB(String un,String pwd) {
			
			loginlink.click();
			fbLoginbtn.click();
		}
		
	   public void loginthroughGmail(String un,String pwd) {
			
			loginlink.click();
			gmail_login.click();
		}

	   public void clickOnForgotPasswordInsideLogin(String un,String pwd) {
		
		loginlink.click();
		forgot_password.click();
		}
	   
	   public ForgotPasswordPage clickOnForgotPasswordInsideSignUp(String un,String pwd) {
			
		    signUpLink.click();
			driver.switchTo().frame("signupiFrame");
			signUpEmail.sendKeys(un);
			signUpPassword.sendKeys(pwd);
			signUpbtn.click();
			retrieveYourpwd.click();
			return new ForgotPasswordPage();
			}

		
		
	

}
