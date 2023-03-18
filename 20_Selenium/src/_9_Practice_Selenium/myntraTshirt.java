package _9_Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraTshirt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/search?q=iphone+13&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone+13%7CMobiles&requestId=ccf53b62-a75f-496c-84f2-a57e9de4b059");
		
		driver.findElement(By.xpath("xpath(\"//div[.='APPLE iPhone 13 (Midnight, 128 GB)']/../../../div[2]/div[2]/div[1]/div[1]/div\")).click();")).click();
		
		
		driver.close();
		
	
		
	}

}
