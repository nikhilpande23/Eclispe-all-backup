package com.Myntra.Generic;

import org.testng.annotations.Test;

import com.Myntra.POM.HomePage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	
 
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  PropertyFileData pf=new PropertyFileData();
	  String  URL= pf.datafromPropertyFile("url");
	  driver.get(URL);  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("database connected");
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("database Disconnected");
  }

}
