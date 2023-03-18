package _14_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_flipkart_iPhone13 {
	
	//script to navigate  to flipkart application and enter iphone13 in Flipkart Search Text Box and then
	// select the first iphone 13
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("iPhone 13");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Green, 128 GB)']")).click();
		//Thread.sleep(2000);
		driver.quit();
		
	}
}
