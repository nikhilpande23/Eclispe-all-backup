package _12_WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_Enabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		boolean Enabled= driver.findElement(By.id("loginButton")).isEnabled();
		if (Enabled==true) {
			System.out.println("seleted element is Enabled");
		}
		else {
			System.out.println("seleted element is NOT-Enabled");
		}
		driver.close();
	}
}

		
		