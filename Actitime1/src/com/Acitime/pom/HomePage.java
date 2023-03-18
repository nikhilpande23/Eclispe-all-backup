package com.Acitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "(//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'])[1]")
	private WebElement usrbtn;
	
	@FindBy (xpath = "(//div[@class='xu06os2 x1ok221b'])[5]")
	private WebElement lgoutbtn;

	public WebElement getUsrbtn() {
		return usrbtn;
	}

	public WebElement getLgoutbtn() {
		return lgoutbtn;
	}
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void logout() {
		usrbtn.click();
		lgoutbtn.click();
	}
	

}
