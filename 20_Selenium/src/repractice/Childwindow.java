package repractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("windowButton")).click();
		
		String pwindow = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		
		for (String wins : allwin) {
			
			driver.switchTo().window(wins);
			if (wins==pwindow) {
				Thread.sleep(3000);
			}
			else {
				Thread.sleep(3000);
				driver.close();
			}
			
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
