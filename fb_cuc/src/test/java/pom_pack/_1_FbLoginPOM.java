package pom_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _1_FbLoginPOM {
	
	// style 1
//	WebDriver ldriver;	// Globle webdriver
//	
////	Constructor : accepting 1 webdriver input. 
//	public _1_FbLoginPOM (WebDriver rdriver) {
//		ldriver=rdriver;
//		PageFactory.initElements(rdriver,this);
//	}
	
	// style 2
	WebDriver driver; // Globle webdriver
	
	public _1_FbLoginPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy (id = "email")
	WebElement uid;
	
	@FindBy (id = "pass")
	WebElement pass;
	
	@FindBy (xpath = "(//button[normalize-space()='Log in'])[1]") //*********************
	WebElement loginbtn;
	
//	@FindBy (xpath = "(//span[@class='x4k7w5x x1h91t0o x1h9r5lt xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j x1jfb8zj'])[4])")
//	WebElement usersymbol;
//	
//	@FindBy (xpath = "//span[normalize-space()='Log Out'])[1]")
//	WebElement logoutlink;
	
	public void enterUsername(String username) {
		uid.sendKeys(username);
	}
	public void enterPassword(String password) {
		pass.sendKeys(password);
	}
	public void clickLoginbutton() {
		loginbtn.click();
	}
//	public void clickUserSymbol() {
//		usersymbol.click();
//	}
//	public void clickLogout() {
//		logoutlink.click();
//	}
	// By style 1
//	public String getPageTitle() {
//		return ldriver.getTitle();
//	}
	
	// By style 2
	public String getPageTitle() {
		return driver.getTitle();
	}
	public boolean welcomePageIsDispaly() {
		return loginbtn.isDisplayed();
	}
//	public boolean homePageIsDisplay() {
//		return usersymbol.isDisplayed();
//	}


}
