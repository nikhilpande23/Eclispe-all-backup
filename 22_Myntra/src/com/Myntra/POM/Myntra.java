package com.Myntra.POM;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Myntra {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		WebElement target = driver.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//div[@class='desktop-getUserInLinks desktop-getInLinks']")).click();
		
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("9012345678");
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
		Thread.sleep(40000);
//		***
		driver.findElement(By.xpath("//div[.='CONTINUE']")).click();
		
//		Login by Password optio---below OTP box 
//		driver.findElement(By.xpath("//div[@class='bottomeLink'])[2]/../div[3]/span")).click();
		
//		driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys("Password132243");
//		***
		driver.findElement(By.xpath("span[.='Password']")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'lg block submitButton')]")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bfa12343");
		
//		driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys("Password132243");
		driver.findElement(By.xpath("//button[contains(@class,'lg block submitButton')]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
