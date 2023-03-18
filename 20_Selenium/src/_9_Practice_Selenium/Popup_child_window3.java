package _9_Practice_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//  close all child windows

public class Popup_child_window3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		
		String pwindow = driver.getWindowHandle();
		 java.util.Set<String> allwin = driver.getWindowHandles();
		 
		 for (String s : allwin) {
			driver.switchTo().window(s);
			
			if (pwindow.equals(s)) {
				
			}
			
			else {
				driver.close();
			}
			
		}
		 
		 
	}


}
