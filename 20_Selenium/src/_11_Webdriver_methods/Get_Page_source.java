package _11_Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_source {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.getPageSource();
		Thread.sleep(3000);
		String driver2= driver.getPageSource();
		System.out.println(driver2);
		
		

	}

}
