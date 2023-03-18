package com.Myntra.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 
	@FindBy (xpath = "//div[@class='desktop-userIconsContainer']")
	private WebElement profilesymbol;
	
	@FindBy (xpath = "//div[@class='desktop-getUserInLinks desktop-getInLinks']")
	private WebElement lginbtn;
	
	@FindBy (xpath = "//input[@autocomplete='new-password']")
	private WebElement mobnotbx;
	
	@FindBy (xpath = "//div[@class='submitBottomOption']")
	private WebElement continbtn;
	
	@FindBy (xpath = "(//div[@class='bottomeLink'])[2]/../div[3]/span")
	private WebElement pswbtn;
	
	@FindBy (xpath = "//input[@class='form-control has-feedback']")
	private WebElement pswtextbox;
	
	@FindBy (xpath = "//div[.='LOGIN']")
	private WebElement loginbypassw;
	
	@FindBy (xpath = "(//div[.=' Logout '])[2]")
	private WebElement logout;
	
//	----------------------------------------------------
	
	public WebElement getPswtextbox() {
		return pswtextbox;
	}

	public WebElement getLoginbypassw() {
		return loginbypassw;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getMobnotbx() {
		return mobnotbx;
	}

	public WebElement getContinbtn() {
		return continbtn;
	}

	public WebElement getUsrsymbol() {
		return profilesymbol;
	}

	public WebElement getLginbtn() {
		return lginbtn;
	}
	
	public WebElement getPswbtn() {
		return pswbtn;
	}
	
	
//	----------------------------------------------------

	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}

//	----------------------------------------------------
	
	public void homepageLogin(WebDriver driver) throws InterruptedException {
		
		
		WebElement target = profilesymbol;
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(target).perform();
		Thread.sleep(2000);
		lginbtn.click();
		Thread.sleep(2000);
		mobnotbx.sendKeys("9511768037");
		Thread.sleep(2000);
		continbtn.click();
		Thread.sleep(40000);
		
		
		
		Thread.sleep(2000);
		
		pswbtn.click();
		Thread.sleep(2000);
		pswtextbox.sendKeys("Pass@123");
		Thread.sleep(2000);
	}	

}
