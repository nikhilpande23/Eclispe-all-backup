package _1_Search_context_methods;

//Handeling multiple elements- in order to handle multiple elements we go for findElements method.
//return type of findElements is List of webelements
//List should be imported from java.util package.
//If the locators are matching with multiple elements it will returns address of all the
//matching elements
//if locators are not matching with any of elements then output will be empty list

import java.util.List;
//Question
//write script to navigate to demo application and click on the 3rd link present in demo application

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class find_Elements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Work/tagname.html");
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		int count= alllink.size();
		System.out.println("size of links :- " + count);
		alllink.get(2).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}	
}
	
