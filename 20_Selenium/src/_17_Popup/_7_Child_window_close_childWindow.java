package _17_Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _7_Child_window_close_childWindow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> window = driver.getWindowHandles();
		
		 for (String parent : window) {
			 Thread.sleep(3000);
			 driver.switchTo().window(parent);
			 if(window.equals(parent)) {
				 
			 }
			 else {
				driver.close();
			 }
			 
		}
	}
}
	