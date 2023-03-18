package _23_POM_Page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untbx; // Declaration
	private WebElement pwtbx;
	private WebElement lgnbtn;
	
	public LoginPage(WebDriver driver) { // to access webdrivers methods inside block

//	untbx=driver.findElement(By.id("username"));
//	pwtbx=driver.findElement(By.name("pwd"));
//	lgnbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	
	public void setUntbx (WebElement untbx) {
		this.untbx=untbx;
	}
	
	public void setPwtbx(WebElement pwtbx) {
		this.pwtbx=pwtbx;
	}
	
	}
	
