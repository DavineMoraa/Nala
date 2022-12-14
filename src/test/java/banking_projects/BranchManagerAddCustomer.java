package banking_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BranchManagerAddCustomer {

	public static void main(String[] args) {
		System.out.println("add customer URL has started");
		// create driver
		System.setProperty("web.chrome.driver", "D:\\Automation Projects\\Java Projects\\chromedriver.exe");
		// create driver variable
		WebDriver driver = new ChromeDriver();
		// call the url
		String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement addcustomer = driver.findElement(By.cssSelector("button[ng-click='addCust()']"));
		addcustomer.sendKeys(Keys.RETURN);
		// verify new url and compare the url
		String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the same as Expected url");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Firstname = driver.findElement(
				By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']")));
		Firstname.sendKeys("Davine");
		WebElement Lastname = driver.findElement(
				By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"));
		Lastname.sendKeys("Moraa");
		WebElement Postaladdress = driver.findElement(
				By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"));
		Postaladdress.sendKeys("515 Kiss");
		WebElement Submit = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		Submit.sendKeys(Keys.RETURN);
		// successful add customer message
		
		String Expectedmessage = "Customer added successfully with customer id: ";
		//String Actualmessage = Expectedmessage.getText();
		//Assert.assertEquals(Actualmessage, Expectedmessage, "No message");
	}

	}

	//public void AddCustomernegativePath()  {

		//}
