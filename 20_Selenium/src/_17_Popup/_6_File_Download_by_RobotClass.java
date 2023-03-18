package _17_Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6_File_Download_by_RobotClass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Robot r= new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	
	r.keyPress(KeyEvent.VK_S);
	Thread.sleep(2000);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	r.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	driver.close();
		
	}

}
