package _1_Search_context_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements_All_links_of_Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		List<WebElement> Alllnks = driver.findElements(By.xpath("//a"));
		int count = Alllnks.size();
		for(int i=0; i<count; i++) {
			String Link = Alllnks.get(i).getText();
			System.out.println(i+Link);
		}
		driver.close();
	}
}
