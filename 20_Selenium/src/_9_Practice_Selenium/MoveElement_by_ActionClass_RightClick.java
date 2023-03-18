package _9_Practice_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElement_by_ActionClass_RightClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		 WebElement target = driver.findElement(By.linkText("actiTIME Inc. "));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_T);
		
		Thread.sleep(5000);
		
		driver.close();
		 
	
	}
	

}
