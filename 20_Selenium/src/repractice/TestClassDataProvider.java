package repractice;

import org.testng.annotations.Test;

import yt_TestNG._2DataProvider_multp_clss;

public class TestClassDataProvider {
	
	@Test(priority = 1, dataProviderClass = _2DataProvider_multp_clss.class, dataProvider = "getdata")
	public void lauchUrl(String Username, String Password) {
		System.out.println("lauchUrl "+Username+" "+Password);
		
	}
	

	@Test(priority = 2, dataProviderClass = _2DataProvider_multp_clss.class, dataProvider = "getdata")
	public void enterCredentials(String Username, String Password) {
		System.out.println("enterCredentials "+Username+" "+Password);
	}
	

	@Test(priority = 3, dataProviderClass = _2DataProvider_multp_clss.class, dataProvider = "getdata")
	public void validateHomePage(String Username, String Password) {
		System.out.println("validateHomePage "+Username+" "+Password);
	}
	

	@Test(priority = 4, dataProviderClass = _2DataProvider_multp_clss.class, dataProvider = "getdata")
	public void logout(String Username, String Password) {
		System.out.println("logout "+Username+" "+Password);
	}

}
