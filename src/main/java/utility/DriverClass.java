package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
//create function
	public WebDriver driver;
	public WebDriver chrome_driver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Projects\\Java Projects\\chromedriver.exe");
	driver = new ChromeDriver();
		return driver;
	}

	public void firefox_driver() {
		
	}
	}