package _9_Practice_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDL_propertyfile_actitime_login {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String path="./TestData/propertyfile.property";
		FileInputStream fis = new FileInputStream(path);
		
		Properties p= new Properties();
		p.load(fis);
		
		String Thane = p.getProperty("url");
		String Andheri = p.getProperty("username");
		String Vashi = p.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(Thane);
		
		driver.findElement(By.id("username")).sendKeys(Andheri);
		driver.findElement(By.name("pwd")).sendKeys(Vashi);
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		Thread.sleep(5000);
		
		driver.close(); 
		
	}

}
