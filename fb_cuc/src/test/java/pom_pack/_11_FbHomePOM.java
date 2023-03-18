package pom_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _11_FbHomePOM {
	
	WebDriver driver;
	
	public _11_FbHomePOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//	@FindBy (xpath = "(//*[local-name()='svg'])[7]")
//	WebElement usersymbol;
	
//	@FindBy (xpath = "(//*[name()='svg' and @style='height:40px;width:40px'])[1]")
//	WebElement usersymbol;
	
	
	
	@FindBy (xpath = "//*[name()='svg' and @aria-label='Your profile']")
	WebElement usersymbol;
	
	@FindBy (xpath = "(//span[normalize-space()='Log Out'])[1]")
	WebElement logoutlink;
	
	@FindBy(xpath = "(//*[local-name()='svg'])[4]")
	WebElement homeICON;
	
	public void clickUserSymbol() {
//		usersymbol.click();
		WebElement target = usersymbol;
		Actions act=new Actions(driver);
		
		act.click(target).perform();
	}
	public void clickLogout() {
		logoutlink.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean homePageIsDisplay() {
		return homeICON.isDisplayed();
	}

}
