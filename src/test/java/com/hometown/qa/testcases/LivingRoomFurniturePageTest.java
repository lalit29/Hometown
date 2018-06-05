package com.hometown.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hometown.qa.base.TestBase;
import com.hometown.qa.pages.HomePage;
import com.hometown.qa.pages.LivingRoomFurniturePage;

public class LivingRoomFurniturePageTest extends TestBase {
	
	HomePage homePage;
	LivingRoomFurniturePage livingRoom;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage=new HomePage();
		livingRoom = new LivingRoomFurniturePage();
	}
	
	@Test(priority=1)
	public void verifyURL() {
		homePage.verifyLivingRoomFurnitureLink();
		String expected= prop.getProperty("url")+"furniture/living-room/";
		
		assertEquals(livingRoom.verifyCurrentURL(), expected);
		
	}
	
	@Test(priority=2)
	public void verifySortByLowToHigh() {
		homePage.verifyLivingRoomFurnitureLink();
		livingRoom.verifySortBy();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
