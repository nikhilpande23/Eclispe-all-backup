package com.TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Acitime.pom.LoginPage;
import com.Actitime.GenericLibrary.Baseclass;

@Listeners(com.Actitime.GenericLibrary.ListnerImplementation.class)


public class CustomerCreated extends Baseclass {
	
	@Test
	public void run() throws InterruptedException {
		Reporter.log("cust created",true);
		Thread.sleep(5000);
		Assert.fail();
	}
	

}
