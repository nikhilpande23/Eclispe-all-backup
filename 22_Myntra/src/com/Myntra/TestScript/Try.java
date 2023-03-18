package com.Myntra.TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Try {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.myntra.com/");
		  Thread.sleep(5000);
		  
//		  driver.findElement(By.xpath("(//a[normalize-space()='Studio'])[1]")).click();
//		  Thread.sleep(5000);
//		  driver.close();
		  
		  WebElement terget = driver.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
		  Actions act=new Actions(driver);
		  act.moveToElement(terget).perform();
		  
		  Thread.sleep(5000);
		  
//		  driver.findElement(By.xpath("//div[@class='desktop-getUserInLinks desktop-getInLinks']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='login / Signup']")).click();
		  Thread.sleep(2000);
		  
	}

}
