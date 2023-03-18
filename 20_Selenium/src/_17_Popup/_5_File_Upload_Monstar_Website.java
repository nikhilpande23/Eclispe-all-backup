package _17_Popup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_File_Upload_Monstar_Website {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monster.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='Upload Resume']")).click();
		Thread.sleep(3000);
		
		
		
		File f= new File("./TestData/Nikhil_Pande.pdf");
		
		String path = f.getAbsolutePath();
		Thread.sleep(3000);
		
		driver.findElement(By.id("file-upload")).sendKeys(path);
		Thread.sleep(3000);
		
		driver.close(); 
		
	
			
	}
}
