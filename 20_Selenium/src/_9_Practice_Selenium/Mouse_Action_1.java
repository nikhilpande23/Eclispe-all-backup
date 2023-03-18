package _9_Practice_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action_1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.vtiger.com/");
		
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target).perform();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Contact")).click();
		
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]"));
		 String pt = text.getText();
		
		System.out.println(pt);
		
		driver.close();
		
	}
}
