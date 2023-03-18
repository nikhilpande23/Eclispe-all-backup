package _9_Practice_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.w3c.dom.Text;

public class Auto_suggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main (String [] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	 
	 driver.navigate().to("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 
	 driver.findElement(By.name("q")).sendKeys("iPhone 13");
	 
	 Thread.sleep(5000);
	 
	List<WebElement> allsugg = driver.findElements(By.xpath("//a[@class='_3izBDY']"));
	
	int count = allsugg.size();
	
	for(int i=0; i<count; i++) {
		String textat = allsugg.get(i).getText();
		System.out.println(textat);
		System.out.println();
	}
	
	driver.close();
	
	
		
		
		
	}
}
