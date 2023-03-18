package com.abc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class A1 {
	
	@Test (priority = 1)
	public void newWebdrivermanagerPOPUP() throws InterruptedException {
		
//		To handle notifications popup
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = WebDriverManager.chromedriver().capabilities(option).create();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.quit();

		
	}
		

		@Test (priority = 2)
		public void newWebdrivermanagerNORMAL() throws InterruptedException {
//		Normal :
		WebDriver driver2 = WebDriverManager.chromedriver().create();
		driver2.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver2.quit();

	}

}
