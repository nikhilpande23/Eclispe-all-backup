package niku;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		TakesScreenshot t=(TakesScreenshot) driver; // Down casting
		
		File ssfile = t.getScreenshotAs(OutputType.FILE); // output type
		
		File dest = new File("./screenshot/ss1.png"); // File Destination
		
		Files.copy(ssfile, dest);	//copy file from To
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
