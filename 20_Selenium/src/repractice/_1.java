package repractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
//		driver.findElement(By.cssSelector(".nav-a[href='/gp/browse.html?node=6648217031&ref_=nav_cs_fashion']")).click();
		WebElement target = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//a[7]//span[1]//i[1]")).click();
		
		

}
}
