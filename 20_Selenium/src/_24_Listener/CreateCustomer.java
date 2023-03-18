package _24_Listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class CreateCustomer {
	@Test
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		Reporter.log("delete customer", true);
		Assert.fail();
	}
	
	public void name() {
		
	} void modifyCustomer() {
		// TODO Auto-generated method stub
		Reporter.log("Modified customer", true);
		Assert.fail();
	}
	

}
