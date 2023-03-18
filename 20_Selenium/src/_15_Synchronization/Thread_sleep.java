package _15_Synchronization;

import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_sleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.apple.com");
		Thread.sleep(2000);
		driver.close();
		
	}

}
