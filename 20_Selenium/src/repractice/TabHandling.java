package repractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabHandling {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement target = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		
		
		String pwindow = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		
		for (String w : allwin) {
			Thread.sleep(3000);
			driver.switchTo().window(w);
			driver.close();
		}
		
		
	}
}
