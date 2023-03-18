package _22_Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class _2Basic {
//	Many @Test annotations here, hence it'll execute in Alphabetical order.
	
	@Test
	public void createcustomer(){
		Reporter.log("Customer created successfully",true);
	}
	
	@Test
	public void editcustomer(){
		Reporter.log("Customer edited successfully",true);
	}
	
	@Test
	public void modifytecustomer(){
		Reporter.log("Customer modified successfully",true);
	}
	
	@Test
	public void deletecustomer(){
		Reporter.log("Customer deleted successfully",true);
	}

}
