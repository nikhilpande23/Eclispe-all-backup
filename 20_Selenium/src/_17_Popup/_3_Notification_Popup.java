package _17_Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class _3_Notification_Popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();

		option.addArguments("--disable-notifications"); //manually see popup
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.yatra.com/");
	}
}
