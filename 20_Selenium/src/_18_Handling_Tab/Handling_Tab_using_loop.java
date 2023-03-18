package _18_Handling_Tab;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// close all the tabs without using quite method.

public class Handling_Tab_using_loop {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Thread.sleep(3000);
		
		Set<String> alltab = driver.getWindowHandles();
		
		for(String tab : alltab) {
			driver.switchTo().window(tab);
			driver.close();
			
		}
	}
}
