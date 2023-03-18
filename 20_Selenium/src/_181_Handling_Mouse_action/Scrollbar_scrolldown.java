package _181_Handling_Mouse_action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar_scrolldown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,4000)"); // Initial to down
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, -3000)"); //down to up
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, +5000)"); //up to down
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, 4000)");
	}
}
