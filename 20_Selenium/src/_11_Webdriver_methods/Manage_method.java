package _11_Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_method {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.apple.com/in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
