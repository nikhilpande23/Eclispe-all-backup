package _16_List_box;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _1_Single_Select_Listbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		//Locating for month
		 WebElement month = driver.findElement(By.id("month"));
		//selecting March month from dropdown list
		 Select s = new Select(month);
		 s.selectByIndex(11); //option 1 : Selecting by index
		 //if not run, use thread.sleep
		 
		 //Locating for date
		 WebElement date = driver.findElement(By.id("day"));
		 Select sdate = new Select(date);
		 sdate.selectByValue("31"); //option 2 : Selecting by value
		//if not run, use thread.sleep
		 
		 //Locating for Year
		 WebElement year = driver.findElement(By.name("birthday_year"));
		 Select syear = new Select(year);
		 syear.selectByVisibleText("2000"); //option 3 : Selecting by visible text
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		 
		 
		
	}
}
