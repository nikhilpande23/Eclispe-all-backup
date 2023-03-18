package _181_Handling_Mouse_action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1_DropDown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Thread.sleep(5000);
		
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions act = new Actions(driver);
//		Thread.sleep(5000);
		act.moveToElement(target).perform();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Contact")).click();
		String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).getText();
		System.out.println(text);
		driver.close();

		}

}
