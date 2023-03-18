package _19_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Enter Mumbai in child & Bengaluru in parent

public class Frames_by_Index_Basic2_html {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///D:/Work/T1.html");
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("t2")).sendKeys("Mumbai");
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("Bengaluru");
		
		
		
		
	}

}
