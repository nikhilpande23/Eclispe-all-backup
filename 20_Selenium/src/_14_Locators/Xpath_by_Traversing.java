package _14_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Traversing {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("_3704LK")).sendKeys("iPhone 13");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//svg[@width='20']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}
	

}
