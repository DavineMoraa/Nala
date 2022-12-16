package banking_projects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.DriverClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Login {

    DriverClass driverpath = new DriverClass();
    WebDriver driver = driverpath.chrome_driver();

    //@BeforeTest
    public void loadWebPage() {
        String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test(priority = 1, enabled = true)
    public void managerlogin() {
        this.loadWebPage();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[ng-click='manager()']"))).sendKeys(Keys.RETURN);
    }

    @Test(priority = 2, enabled = false)
    public void Customerlogin() throws InterruptedException {
        this.loadWebPage();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[ng-click='customer()']"))).sendKeys(Keys.RETURN);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        String actualUrl = driver.getCurrentUrl();
        Thread.sleep(3000);
        Select dropName = new Select(driver.findElement(By.id("userSelect")));
       dropName.selectByVisibleText("Ron Weasly");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-default']"))).sendKeys(Keys.RETURN);

    }
}
