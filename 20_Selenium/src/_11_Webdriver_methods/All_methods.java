package _11_Webdriver_methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_methods {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
//		manage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//		get & Navigate 
		driver.get("https://facebook.com/");
		
//		getPageSource
		String pagesource = driver.getPageSource();
		System.out.println("getPageSource : "+ pagesource);
		
//		getCurrentUrl
		String currenturl=driver.getCurrentUrl();
		System.out.println("CurrentUrl : "+ currenturl);
		
//		getTitle
		String title=driver.getTitle();
		System.out.println("getTitle : "+ title);
		
		
		
		
	}
	

}
