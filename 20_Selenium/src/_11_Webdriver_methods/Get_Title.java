//Write a script to login a facebook application, Get the title and print it on console.
package _11_Webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); //if path is wrong
		ChromeDriver driver=new ChromeDriver(); 		//will get java illegal state exception
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		driver.close();
		System.out.println(title);

	}

}
