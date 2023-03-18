package _9_Practice_Selenium;

import java.time.Duration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handles {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> wi = windows.iterator();
		String pwin = wi.next();
		String cwin = wi.next();
		
		driver.switchTo().window(cwin);
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(pwin);
		Thread.sleep(3000);
		driver.close();
		
	}

}
