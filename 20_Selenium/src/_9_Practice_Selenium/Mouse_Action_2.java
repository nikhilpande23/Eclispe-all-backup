package _9_Practice_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// actitime/R.Click on Actitime Inc/select new tab by Robot class pressing V/close browser.

public class Mouse_Action_2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement target = driver.findElement(By.xpath("//a[contains(.,'actiTIME Inc.')]"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(target).perform();
		Thread.sleep(3000);
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_V); // Stmnt not execauting
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
	}
}
