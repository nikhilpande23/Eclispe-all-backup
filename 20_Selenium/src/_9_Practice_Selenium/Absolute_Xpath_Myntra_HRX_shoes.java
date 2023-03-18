package _9_Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import _14_Locators.Xpath_by_contains_function;

public class Absolute_Xpath_Myntra_HRX_shoes {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		
		
		
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Hrx Tshirts");
//		driver.findElement(By.className("desktop-submit")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//h3[@class='product-brand'])[1]/../../div[2]/div/span/span")).click();
				
	}

}
