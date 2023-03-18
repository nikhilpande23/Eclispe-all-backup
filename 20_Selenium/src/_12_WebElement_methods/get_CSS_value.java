package _12_WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_CSS_value {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String cssvalue = driver.findElement(By.name("q")).getCssValue("color");
		//String cssvalue = driver.findElement(By.id("voiceSearchButton")).getCssValue("color");
		//css value get from Inspect-elements-styles
		//It is a java script
		//we have to input key and we will get output as a value.
		System.out.println(cssvalue);
		driver.close();
		
	}
}
