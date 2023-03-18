package _9_Practice_Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_file_upload {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		File f= new File("./TestData/TestData.xlsx");
		String apath = f.getAbsolutePath();
		
		driver.findElement(By.id("uploadfile_0")).sendKeys(apath);
		Thread.sleep(5000);
		driver.close();
	}

}
