package com.Acitime.pom;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	No method here
		@FindBy (xpath = "(//div[@class='clearfix _5466 _44mg'])[1]")
		private WebElement idtxbx;
		
		@FindBy (xpath = "(//div[@class='clearfix _5466 _44mg'])[2]")
		private WebElement passtxbx;
		
		@FindBy (id="loginbutton")
		private WebElement logbtn;

		public WebElement getIdtxbx() {
			return idtxbx;
		}

		public WebElement getPasstxbx() {
			return passtxbx;
		}

		public WebElement getLogbtn() {
			return logbtn;
		}
		
		public LoginPage(WebDriver driver){
			PageFactory.initElements(driver,this);
		}
		
		public void loginFB(String un,String pas ) {
			idtxbx.sendKeys(un);
			passtxbx.sendKeys(pas);
			logbtn.click();
		}
		
		

	

}
