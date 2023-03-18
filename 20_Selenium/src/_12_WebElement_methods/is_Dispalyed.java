package _12_WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_Dispalyed {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean displayed = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		
		if (displayed == true)
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("Not displayed");
		}
		
	}

}
