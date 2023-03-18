package _14_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Absolute_1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		Thread.sleep(2000);
		web.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
//		Popup closing
		web.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		web.findElement(By.name("q")).sendKeys("iPhone 13"); // searching	
		web.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		web.findElement(By.xpath("//div[.='APPLE iPhone 13 (Green, 128 GB)']/../../../div[2]/div[2]/div[1]/div/div")).click();
		
		Thread.sleep(2000);
		
		web.close();

	}
}

