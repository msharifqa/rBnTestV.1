package CoreClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	

	public void OpenBrowser() {
		

		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().fullscreen();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	

}
