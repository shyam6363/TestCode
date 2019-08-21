package Pratice.All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver","G:\\Selenium_Practice\\All\\Drivers\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	}
   
}
