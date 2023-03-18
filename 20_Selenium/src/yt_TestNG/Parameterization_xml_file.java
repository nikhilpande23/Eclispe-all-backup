package yt_TestNG;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_xml_file {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	
	@Test
	
	@Parameters({"URL","UNAME","PASSW"})
	
	public void fbLogin(String URL,String UNAME, String PASSW) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("URL");
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("UNAME");
		driver.findElement(By.id("passContainer")).sendKeys("PASSW");
		driver.findElement(By.id("u_0_5_90")).click();
		
		Thread.sleep(5000);
		driver.close();
	
	}
}
