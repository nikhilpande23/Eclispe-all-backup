package _14_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to login atitime application after copy the code

public class Xpath_by_Text_Function {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		//driver.findElement(By.xpath("//div[text='Login ']")).click(); //also correct
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}	
}
