package _14_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Absolute_Amazon {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		Thread.sleep(2000);
		web.navigate().to("https://www.amazon.in/");
		
		web.findElement(By.xpath("//input[@type='text']")).sendKeys("macbook pro");
		Thread.sleep(2000);
		
		web.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		web.findElement(By.xpath("(//span[contains(text(), '2020 Apple MacBook Air Laptop: Apple M1 chip')])[2]/../../../../../../../div[2]/div/div/div[3]/div/div/div/div/a/span")).click();
		Thread.sleep(2000);
		web.close();
		
		
	}

}
