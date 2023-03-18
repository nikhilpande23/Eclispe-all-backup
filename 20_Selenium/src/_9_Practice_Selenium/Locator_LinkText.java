package _9_Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_LinkText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver L1 = new ChromeDriver();
		
		L1.manage().window().maximize();
		
		L1.get("http://cellbuddy.in/");
		
		L1.findElement(By.linkText("Shop Now")).click();
		
		Thread.sleep(5000);
		
		L1.close();
	}
}
