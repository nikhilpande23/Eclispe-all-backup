package _16_List_box;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _3_Deselect_All_ListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///D:/Work/Multiple%20Select%20Listbox.html");
		WebElement tajhotel = driver.findElement(By.id("Taj Hotel"));
		Select s = new Select(tajhotel);
		s.selectByValue("pav");
		s.selectByIndex(3);
		s.selectByVisibleText("Surmai Fry");
		
		// de-selecting the options in the list
		
		//Even if option is selected by using one select method, we can de-select it by any
		// de-selecting method.
		Thread.sleep(3000);
		s.deselectAll();
		
		
	}

}
