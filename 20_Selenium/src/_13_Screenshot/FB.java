package _13_Screenshot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/login");
		String loginTitle = driver.getTitle();
		System.out.println("loginTitle 1 : "+ loginTitle);
		
		driver.findElement(By.id("email")).sendKeys("er.nikhilpande@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Facebook@nik"); //
		driver.findElement(By.name("login")).click();
		
		String logoutTitle = driver.getTitle();
		System.out.println("logoutTitle 2 : "+ logoutTitle);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='x4k7w5x x1h91t0o x1h9r5lt xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j x1jfb8zj'])[4]")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='Log Out'])[1]")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
