package firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSeleniumTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.safari.driver", "SafariDriver.safariextz");
		//WebDriver driver = new SafariDriver();
		
		//System.setProperty("webdriver.geckodriver", "geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
			
		//driver.get("https://www.google.com/");
		driver.get("https://www.aetna.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@class='sb-icon']//img")).getLocation());
		
		
		driver.close();
		
	
	
	
	
	}
 
	
	
}
