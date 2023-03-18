package _8_Combine_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Flipkart_iPhone13 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000); //optional bcoz popup may take some time to come
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000); //optional
		driver.findElement(By.name("q")).sendKeys("iphone 13"); 
		Thread.sleep(3000); //Mandatory,after entered text, suggestions may take some time to come
		
		List<WebElement> Autosugg = driver.findElements(By.xpath("//span[.='iphone 13']/.."));
		
		int count = Autosugg.size(); //for for loop limit. count how many matching elements are there 
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			String text = Autosugg.get(i).getText();
			System.out.println(text);
			System.out.println(" "); // Just to add space in between
		}
		driver.quit();

	}
}
