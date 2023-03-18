package _22_Test_NG;

import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void assertion() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		String expectedtitle = "Soogle";
		String actualtitle = driver.getTitle();
		
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);
		
		driver.close();
		
		s.assertAll();
			
	}

}
