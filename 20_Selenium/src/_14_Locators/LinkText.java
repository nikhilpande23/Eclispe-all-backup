package _14_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("file:///D:/Work/tagname.html");
		web.findElement(By.linkText("Tinder")).click();
		Thread.sleep(2000);
		web.close();
	}
}
