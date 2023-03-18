package _9_Practice_Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Links {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main (String [] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 
		 driver.get("https://www.amazon.in/");
		 
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		  int count = links.size();
		  
		  for(int i=0; i<count; i++) {
			 String toprint = links.get(i).getText();
			 
			 System.out.println("@"+i+toprint);
			 System.out.println();
		  }
		  
		  driver.close();
		
	}
}
