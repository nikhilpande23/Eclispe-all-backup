package _17_Popup;

import java.time.Duration;

import org.apache.poi.hemf.record.emfplus.HemfPlusDraw.EmfPlusDrawDriverString;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_Alert_Popup {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("Dhoni");
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
		
		Alert a=driver.switchTo().alert();
		
		a.accept();
		//a.dismiss();
		//a.getText();
		Thread.sleep(3000);
		driver.close();	
	}
}
