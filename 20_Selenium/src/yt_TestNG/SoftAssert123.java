package yt_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert123 {
	
	@Test
	public void validation() {
		
		SoftAssert sa=new SoftAssert();
		
		boolean b1= 10<20; // Expected : True
		boolean b2= 50>1000; // Actual : False
		sa.assertEquals(b2, b1);
		
		int a=10; int b=20;
		System.out.println("Still getting result " + (a+b) );
		sa.assertTrue(true);
		
		sa.assertAll();	// IMP at last
	}

}
