package _11_Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_url {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			Thread.sleep(5000);
			String Nikhil=driver.getCurrentUrl();
			System.out.println(Nikhil);
			driver.close();

	}

}
