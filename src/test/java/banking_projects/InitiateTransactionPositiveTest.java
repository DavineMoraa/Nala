package banking_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateTransactionPositiveTest {

	public static void main(String[] args) {
		System.out.println("Account URL has started");
		//create driver
				System.setProperty("web.chrome.driver", "D:\\Automation Projects\\Java Projects.chromedriver.exe");
				// create driver variable
				WebDriver driver = new ChromeDriver();
				// call the url
				String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
				driver.get(url);
				driver.manage().window().maximize();
				WebElement customerLogin = driver.findElement(By.cssSelector("button[ng-click='deposit()']"));
				customerLogin.sendKeys(Keys.RETURN);
				WebElement Amount = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
				Amount.sendKeys("5000");
				WebElement Deposit = driver.findElement(By.xpath("//button[@class='btn logout']"));
				Deposit.sendKeys(Keys.RETURN);
				
	}
	//public void InitiateTransactionnegativePath()  {

	//}
}
