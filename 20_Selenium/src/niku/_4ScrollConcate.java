package niku;

// Write a script to scroll down upto Featured video of BBC Applications.

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4ScrollConcate {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bbc.com/");

int y = driver.findElement(By.xpath("//span[.='Featured video']")).getLocation().getY();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0, " +y+ ")");
//js.executeScript("window.scrollBy(0," + y + ")");
Thread.sleep(6000);
driver.close();




}

}