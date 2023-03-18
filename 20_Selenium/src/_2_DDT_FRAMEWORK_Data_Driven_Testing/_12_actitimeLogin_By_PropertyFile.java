package _2_DDT_FRAMEWORK_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _12_actitimeLogin_By_PropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./TestData/propertyfile.property");
		
		Properties p=new Properties();
		
		p.load(fis);
		//Thread.sleep(10000);
		String URL1 = p.getProperty("url");
		String USERNAME1 = p.getProperty("username");
		String PASSWORD1 = p.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		driver.get(URL1);
		driver.findElement(By.id("username")).sendKeys(USERNAME1);
		Thread.sleep(5000);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		Thread.sleep(10000);
		
		driver.close();
		
	}

}
