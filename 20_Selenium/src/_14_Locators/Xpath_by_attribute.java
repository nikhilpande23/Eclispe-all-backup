package _14_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_attribute {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///D:/Work/tagname.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@name='n3']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
