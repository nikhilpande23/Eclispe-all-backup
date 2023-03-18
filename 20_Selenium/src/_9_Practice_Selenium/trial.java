package _9_Practice_Selenium;
//write a script to print all the links present in amazon.in
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trial {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		List<WebElement> address = driver.findElements(By.xpath("//a"));
		int count = address.size();
		for(int i=0; i<count; i++) {
		
			String xyz = address.get(i).getText();
			System.out.println("index "+i+" "+" "+xyz);
		}
		driver.close();
		
	}
}
