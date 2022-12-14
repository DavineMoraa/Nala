package banking_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.DriverClass;
import java.time.Duration;
import static java.lang.Thread.sleep;

public class Login {

	DriverClass driverpath = new DriverClass();
	WebDriver driver = driverpath.chrome_driver();
	//@BeforeTest
	public void loadWebPage(){
		String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test(priority=1, enabled = true)
	public void managerlogin () throws InterruptedException {
		this.loadWebPage();
		Thread.sleep(20000);
		WebElement managerLogin = driver.findElement(By.cssSelector("button[ng-click='manager()']"));
		managerLogin.sendKeys(Keys.RETURN);
	}
	@Test(priority=2, enabled = true)
	public void Customerlogin() throws InterruptedException {
	this.loadWebPage();
		Thread.sleep(3000);
		WebElement customerLogin = driver.findElement(By.cssSelector("button[ng-click='customer()']"));
		customerLogin.sendKeys(Keys.RETURN);
		// verify new url
		String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
		// method to compare the two urls
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		String actualUrl = driver.getCurrentUrl();
		sleep(20000);
		//Assert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the same as Expected url");
		Select dropName = new Select(driver.findElement(By.id("userSelect")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userSelect")));
		dropName.selectByVisibleText("Ron Weasly");
		WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		login.sendKeys(Keys.RETURN);

	}
}
