package niku;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg_Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();	
		driver.findElement(By.name("q")).sendKeys("iPhone 14");
		Thread.sleep(3000);
		
		List<WebElement> allsugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		int count=allsugg.size();
		
		System.out.println("Total auto-suggestions = "+count);
		
		for (int i = 0; i < count; i++) {
			String text=allsugg.get(i).getText();
			System.out.println(text);
			System.out.println("");
		}
		driver.quit();
	
	}

}
