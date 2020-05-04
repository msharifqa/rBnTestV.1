package CoreClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	public WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SendKeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	public void Click (By by) {
		driver.findElement(by);
	}

}
