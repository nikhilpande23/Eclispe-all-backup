package _19_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write Mumbai in parent frame & Bengaluru in child frame

public class Frames_by_Index_Basic1_html {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		
		driver.get("file:///D:/Work/T1.html");
		driver.findElement(By.id("t1")).sendKeys("Mumbai");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("t2")).sendKeys("Bengaluru");
	}
}
