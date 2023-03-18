package _17_Popup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_File_Upload_basic {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///C:/Users/it360/Desktop/fileupload.html");
		Thread.sleep(5000);
		
		File f = new File("./TestData/Nikhil_Pande.pdf");
		
		String path = f.getAbsolutePath();
		Thread.sleep(5000);
		
		driver.findElement(By.id("cv")).sendKeys(path);
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
