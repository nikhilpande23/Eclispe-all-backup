package _18_Handling_Tab;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// first close child tab
// Then close parent tab
//without using loop
public class Handling_Tab_without_loop {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Thread.sleep(3000);
		
		Set<String> alltab = driver.getWindowHandles();	
		
		Iterator<String> itr = alltab.iterator();
		String ptab = itr.next();
		String ctab = itr.next();
		
		driver.switchTo().window(ctab);
		Thread.sleep(3000); 
		driver.close();
		
		driver.switchTo().window(ptab);
		Thread.sleep(3000);
		driver.close();
	}

}
