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

public class Annotation2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database disconnected", true);
	}
	
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected", true);
	}
	
	public WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		
		Reporter.log("launch the browser", true);
	}
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("login to application", true);
		
	}
	
	@Test
	public void createCustomer() {
		Reporter.log("CreateCustomer", true);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logout from application", true);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("close the browser", true);
	}

}
