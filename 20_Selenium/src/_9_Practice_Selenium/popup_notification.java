package _9_Practice_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup_notification {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(3000);
		
		driver.close();
				
	}
}
