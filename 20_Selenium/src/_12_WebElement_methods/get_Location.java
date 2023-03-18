package _12_WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Location {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		int locationX = driver.findElement(By.name("login")).getLocation().getX();
		int locationY = driver.findElement(By.name("login")).getLocation().getY();
		if (locationX==locationY) {
			System.out.println("Axis are alinged properly");
		}
		else {
			System.out.println("Axis are NOT alinged properly");
		}
		driver.close();
	}

}
