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

public class CustomerLogin {

	public static void main(String[] args) {
		System.out.println("Glabalsqa Bank URL has started");
		//create driver
				System.setProperty("web.chrome.driver", "D:\\Automation Projects\\Java Projects.chromedriver.exe");
				// create driver variable
				WebDriver driver = new ChromeDriver();
				// call the url
				String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
				driver.get(url);
				driver.manage().window().maximize();
				sleep(300000);
				WebElement customerLogin = driver.findElement(By.cssSelector("button[ng-click='customer()']"));
				sleep(300000);
				customerLogin.sendKeys(Keys.RETURN);
				// verify new url
				String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
				String actualUrl = driver.getCurrentUrl();
				// method to compare the two urls
				Assert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the sameas Expected url");
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				sleep(20000);
				Select dropName = new Select(driver.findElement(By.id("userSelect")));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userSelect")));
				dropName.selectByVisibleText("Harry Potter");
				WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
				login.sendKeys(Keys.RETURN);

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
