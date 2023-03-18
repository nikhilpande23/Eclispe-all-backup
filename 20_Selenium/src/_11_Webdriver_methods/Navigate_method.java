package _11_Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();

	}

}
