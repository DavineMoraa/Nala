package banking_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BranchManagerOpenAccount {

	public static void main(String[] args) {
		System.out.println("Open Account URL has started");
        //create driver
		System.setProperty("web.chrome.driver", "D:\\Automation Projects\\Java Projects.chromedriver.exe");
		// create driver variable
		WebDriver driver = new ChromeDriver();
		// call the url
		String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";
		driver.get(url);
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		sleep(30000);
		WebElement openaccount = driver.findElement(By.cssSelector("button[ng-click='openAccount()']"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[ng-click='openAccount()']")));
		openaccount.sendKeys(Keys.RETURN);
		sleep(30000);
		
		String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/openAccount";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the same as Expected url");
		
		Select dropName = new Select(driver.findElement(By.id("userSelect")));
		dropName.selectByVisibleText("Harry Potter");
		Select currency = new Select(driver.findElement(By.id("currency")));
		currency.selectByVisibleText("Dollar");
		WebElement Process = driver.findElement(By.cssSelector("button[type='submit']"));
		Process.sendKeys(Keys.RETURN);
		
		// successful open account message
		String Expectedmessage = "Account created successfully with account Number :1017 ";
		//String Actualmessage = Expectedmessage.getText();
		//Assert.assertEquals(Actualmessage, Expectedmessage, "No message");
	}
	
	//public void OpenAccountnegativePath()  {

			//}

	private static void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
