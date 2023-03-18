package stepDefination_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_pack._11_FbHomePOM;
import pom_pack._1_FbLoginPOM;

public class _1_FbLoginSDF {

	public WebDriver driver;
	public _1_FbLoginPOM fblogin;
	public _11_FbHomePOM fbHomePage;

	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(option);
		fblogin=new _1_FbLoginPOM(driver);
	}

	@And("enters URL as {string}")
	public void enters_url_as(String url) {
		driver.navigate().to(url);
	}

//	@Then("page title should be {string}")
//	public void page_title_should_be(String expectedPageTitle) {
//		String actualPageTitle=fblogin.getPageTitle();
//		if (expectedPageTitle.equalsIgnoreCase(actualPageTitle)) {
//			Assert.assertTrue(true, "Correct Login Page Title");
//		}
//		else {
//			Assert.assertTrue(false, "Wrong Login Page Title");
//		}
//	}
	@Then("user should get Welcome Page of Facebook")
	public void user_should_get_welcome_page_of_facebook() throws InterruptedException {
		Thread.sleep(1000);
		boolean welcomeTitle = fblogin.welcomePageIsDispaly();
		if (welcomeTitle==true) {
			Assert.assertTrue(true, "Correct Login Page Title");
		}
		else {
			Assert.assertTrue(false, "Wrong Login Page Title");
		}
	}

	@When("^enters username as (.*) and password as (.*)$")
	public void enters_username_and_password_(String username, String password) throws InterruptedException {
		fblogin.enterUsername(username);
		fblogin.enterPassword(password);
		Thread.sleep(1000);
		
		
	}
	
	 @And ("user click on Login button")
	 public void click_on_Login_button() throws InterruptedException {
		 fblogin.clickLoginbutton();
		 Thread.sleep(5000);
	 }

//	@Then("user should get page title as {string}")
//	public void user_should_get_page_title_as(String expectedPageTitle) {
//		String actualPageTitle=fblogin.getPageTitle();
//		if (expectedPageTitle.equalsIgnoreCase(actualPageTitle)) {
//			Assert.assertTrue(true, "Correct Logout Page Title");
//		}
//		else {
//			Assert.assertTrue(false, "Wrong Logout Page Title");
//		}
//	}
	
	// old POM madhe hota mhanun comnt kelay. aata ajun 1 pom banvlay
//	@Then("user should get Home Page of Facebook")
//	public void user_should_get_home_page_of_facebook() throws InterruptedException {
//		Thread.sleep(1000);
//	  boolean homeTitle = fblogin.homePageIsDisplay(); 
//	  if (homeTitle==true) {
//			Assert.assertTrue(true, "Correct Login Page Title");
//		}
//		else {
//			Assert.assertTrue(false, "Wrong Login Page Title");
//		}
//	}
	
	// removing bcoz "Then user should get Home Page of Facebook" is removed from featureF
//	@Then("user should get Home Page of Facebook")
//	public void user_should_get_home_page_of_facebook() throws InterruptedException {
//		Thread.sleep(1000);
//	  boolean homeTitle = fbHomePage.homePageIsDisplay(); 
//	  if (homeTitle==true) {
//			Assert.assertTrue(true, "Correct Login Page Title");
//		}
//		else {
//			Assert.assertTrue(false, "Wrong Login Page Title");
//		}
//	}
	
	
	// old POM madhe hota mhanun comnt kelay. aata ajun 1 pom banvlay
//	@And("user click on Logout button")
//	public void user_click_on_logout_button() throws InterruptedException {
//		fblogin.clickUserSymbol();
//		Thread.sleep(1000);
//		fblogin.clickLogout();
//		Thread.sleep(1000);
//	}
	 
	 @And("user click on user icon")
	 public void click_on_user_icon() throws InterruptedException {
		 try {
			 Thread.sleep(2000);
			 fbHomePage.clickUserSymbol();
			 Thread.sleep(3000);
		} catch (NullPointerException e) {
//			System.out.println(e);
		}
		 
	 }
	
	@And("user click on Logout button")
	public void user_click_on_logout_button() throws InterruptedException {
		try{
			fbHomePage.clickLogout();
			Thread.sleep(2000);
		} catch (NullPointerException e) {
//			System.out.println(e);
		}
		
	}

	@And("browser should close")
	public void browser_should_close() {
		driver.close();
	}

}
