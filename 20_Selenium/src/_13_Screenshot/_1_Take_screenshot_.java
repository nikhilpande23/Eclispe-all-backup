package _13_Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class _1_Take_screenshot_ {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.shaadi.com/");
		
		TakesScreenshot t=(TakesScreenshot) driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/ss.png");
		
		Files.copy(src, dest);
		
		driver.close();
	}
}
