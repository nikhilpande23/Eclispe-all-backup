package _19_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Switch control parent to child by using value as an argument.

public class Frames_by_Value_Basic1_html {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///D:/Work/T1.html");
		
		driver.findElement(By.id("t1")).sendKeys("Mumbai");
		
		driver.switchTo().frame("d2"); //2nd one to select
		Thread.sleep(3000);
		
		driver.findElement(By.id("t2")).sendKeys("Bengaluru");
		
		
	}
}
