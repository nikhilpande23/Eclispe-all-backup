package yt_TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basic {
	
	@Test(priority = 1)
	public void launchUrl() {
//		Assert.fail();
		Reporter.log("url launched :",true);
		
	}
	
	@Test(priority = 2, dependsOnMethods = "launchUrl", alwaysRun = true)
	public void loginPage() {
	Reporter.log("login done :",true);	
	}
	
	@Test(priority = 3)
	public void homePage() {
	Reporter.log("home page launched :",true);
	}
	
	@Test(priority = 4)
	public void logoutPage() {
	Reporter.log("Logout done :",true);
	}
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Before method run :",true);
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("After method run :",true);
	}
	

}
//@Test(priority = 4, enabled = false) //will skip this method