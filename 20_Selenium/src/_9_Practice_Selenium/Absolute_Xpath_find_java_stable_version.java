package _9_Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath_find_java_stable_version {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		driver.findElement(By.xpath("(//p[@class='card-text m-0 pb-1'])[7]/../../div[2]/p[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
