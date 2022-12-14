package banking_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DeleteAccount {

	public static void main(String[] args) {
		System.out.println(" Delete Account URL has started");
		//create driver
				System.setProperty("web.chrome.driver", "D:\\Automation Projects\\Java Projects.chromedriver.exe");
				// create driver variable
				WebDriver driver = new ChromeDriver();
				// call the url
				String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";
				driver.get(url);
				driver.manage().window().maximize();
				sleep(30000);
				WebElement Customers = driver.findElement(By.cssSelector("button[ng-click='showCust()']"));
				Customers.sendKeys(Keys.RETURN);
				
				//String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list";
				//String actualUrl = driver.getCurrentUrl();
				sleep(30000);
				//Assert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the same as Expected url");
				WebElement SearchCustomer = driver.findElement(By.xpath("//input[@class='form-control ng-valid ng-touched ng-dirty ng-valid-parse']"));
				SearchCustomer.sendKeys("Harry");
				WebElement Deletecustomer = driver.findElement(By.cssSelector("button[ng-click='deleteCust(cust)']"));
				Deletecustomer.sendKeys(Keys.RETURN);
				
sleep(20000);
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
