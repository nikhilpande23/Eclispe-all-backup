package _181_Handling_Mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_n_Drop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement target1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement target2 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(target1, target2).perform();
		Thread.sleep(10000);
		driver.close();

		}
}
