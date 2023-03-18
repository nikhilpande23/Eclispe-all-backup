package _24_Listener;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class _1_ListenerImplementation implements ITestListener {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
	}
	
	public void onTestFailure(ITestResult result) {
		
		String name = result.getName();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.acttitme.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/" + name +".png" );
		
		try {
			Files.copy(src, dest);
		} catch (Exception e) {
			
		}
		driver.close();
		
	}
	
}
