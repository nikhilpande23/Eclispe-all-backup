package _181_Handling_Mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.vtiger.com/");
		Thread.sleep(5000);
		
//		WebElement target = driver.findElement(By.xpath("(//a[@data-toggle='collapse'])[3]"));
		WebElement target = driver.findElement(By.id("navbarPages"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(5000);
		
		driver.findElement(By.className("list-link")).click();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//h1[contains(text(),'Revolutionized Marketing')]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();
	}

}
