package _22_Test_NG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annoations {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	WebDriver driver; // Datatype and variable. 
//						If webdriver driver=new chromedriver(); this can only use in main method.
	
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database connected", true);
	}
	
	@AfterSuite
	public void databaseClosed() {
		Reporter.log("database closed", true);
	}

	
	@BeforeClass
	public void launchBrowser() {
		driver=new ChromeDriver(); //No need to mention datatype of driver here, bcoz alredy decleared at starting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
	
	@BeforeMethod
	public void login() {
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@AfterMethod
	public void databaseclosed() {
	driver.findElement(By.id("logoutLink")).click();
	}
	
	@Test
	public void clickonTask() {
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
	}
}
