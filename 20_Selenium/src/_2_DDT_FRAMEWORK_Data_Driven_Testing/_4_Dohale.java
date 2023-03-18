package _2_DDT_FRAMEWORK_Data_Driven_Testing;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import _21_Generic_Library.Excel_Generic_Lib_1;
import _21_Generic_Library.Propertyfile_Generic_Lib_1;

public class _4_Dohale {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
//		To get EXCEL data from Generic Library
		
		Excel_Generic_Lib_1 e= new Excel_Generic_Lib_1();
		String username = e.readDataFromExcel("Sheet1", 1, 0);
		String password = e.readDataFromExcel("Sheet1", 1, 1);
		
		WebDriver driver = new ChromeDriver();

//		To get NOTEPAD or PROPERTY FILE data from Generic Library
		
		Propertyfile_Generic_Lib_1 p = new Propertyfile_Generic_Lib_1();
		
		String link = p.readDataFromNotepad("value"); //WHY VALUE
		driver.get(link);
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		driver.close();
		}
}
