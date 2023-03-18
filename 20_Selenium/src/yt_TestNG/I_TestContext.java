package yt_TestNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class I_TestContext {
	
	// Multiple @Test in 1 classs
	//want to get same data in multiple @Test..use this feature of TestNG
	
	@Test (priority = 1)
	public void setUp ( ITestContext context ) {
		System.out.println("This is setup method");
		
		//set data 
		context.setAttribute("windows-10", "Asus");
	}
	
	@Test (priority = 2)
	public void Logic( ITestContext context ) {
		System.out.println("This is Logic method");
		
		//get data from above @Test
	String  storinghere = (String) context.getAttribute("windows-10");
	System.out.println(storinghere);
	}
}