package _9_Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath_actitime_Testing_status {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		
		driver.findElement(By.className("textField")).sendKeys("admin");
		Thread.sleep(1000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='item_link'])[5]")).click();
		
		driver.findElement(By.xpath("//td[@class='listtblcell billingTypeCell']/../td[2]")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
