package com.Myntra.TestScript;

import org.testng.annotations.Test;

import com.Myntra.Generic.Baseclass;
import com.Myntra.POM.HomePage;

public class Login extends Baseclass {
	
	@Test
	public void loginMethod() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.homepageLogin(driver);
		
	}
}
