package yt_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _1DataProvider {
		// Step 1
	
	@org.testng.annotations.DataProvider
	public Object[][] getData()   // Method
	{ 
		// Step 2
		Object [][] data=new Object[3][4];
		
		data[0][0]="user1";
		data[0][1]="passw1";
		data[0][2]=901;
		data[0][3]="FB1";
		
		data[1][0]="user2";
		data[1][1]="passw2";
		data[1][2]=902;
		data[1][3]="FB2";
		
		data[2][0]="user3";
		data[2][1]="passw3";
		data[2][2]=903;
		data[2][3]="FB3";
		
		return data;
	}
		// Step 3
		@Test(dataProvider = "getData", priority = 1)
		public void dataMatrix(String Username,String Password,int Mob,String SocialAc)
		{
			
		}
		
		
		@BeforeMethod
		public void BM() {
			Reporter.log("BM",true);
		}
		
		@AfterMethod
		public void AM() {
			Reporter.log("AM",true);
		}
		
		@Test(priority = 2)
		public void T2() {
			Reporter.log("Test2",true);
		}
}
