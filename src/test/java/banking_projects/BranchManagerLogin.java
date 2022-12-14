package banking_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.DriverClass;

public class BranchManagerLogin {
	
     DriverClass driverpath = new DriverClass();
	WebDriver driver = driverpath.chrome_driver();
	@Test
    public static void main(String[] args) {
		//WebDriver driver = driverpath.chrome_driver();
		//System.out.println("globalsqa URL has started");
         //create driver
		//System.setProperty("web.chrome.driver", "D:\\Automation Projects\\Java Projects.chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		// call the url
		//String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	    //driver.get(url);
		//driver.manage().window().maximize();
		sleep(2000);
		//WebElement managerLogin = driver.findElement(By.cssSelector("button[ng-click='manager()']"));
		//managerLogin.sendKeys(Keys.RETURN);
		//driver.close();

	}

	private static void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
