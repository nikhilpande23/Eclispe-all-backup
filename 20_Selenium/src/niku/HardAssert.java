package niku;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public void assertion() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");

		String expectedtitle = "Soogle";
		String actualtitle = driver.getTitle();

		Assert.assertEquals(expectedtitle, actualtitle);// comparison False
		// Assert.assertNotEquals(expectedtitle, actualtitle); // comparison True

		driver.close();
	}

}
