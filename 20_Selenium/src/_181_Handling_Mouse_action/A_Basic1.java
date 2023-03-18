package _181_Handling_Mouse_action;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_Basic1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		
		WebElement Target = driver.findElement(By.className("module__title__link tag tag--news"));
		Actions acti = new Actions(driver);
		acti.moveToElement(Target).perform();
		
		Thread.sleep(5000);
		driver.close();
	}
}
