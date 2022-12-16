package banking_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.DriverClass;

import java.time.Duration;

public class Transactions extends Login {

    @Test(priority = 1, enabled = true)
    public void DepositsPositiveTests() throws InterruptedException {
        Customerlogin();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[ng-click='deposit()']"))).sendKeys(Keys.RETURN);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[ng-model='amount']"))).sendKeys("5000");
        Thread.sleep(2000);
        WebElement Deposit = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        Deposit.sendKeys(Keys.RETURN);
    }
    @Test(priority = 2, enabled = true)
    public void DepositsNegativeTests() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[ng-click='deposit()']"))).sendKeys(Keys.RETURN);
        WebElement Amount1 = driver.findElement(By.cssSelector("input[ng-model='amount']"));
        Amount1.sendKeys("");
        WebElement Deposit = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        Deposit.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
    }
    @Test(priority = 3, enabled = true)
    public void VerifyTransactions() throws InterruptedException {
        WebElement deposits = driver.findElement(By.cssSelector("button[ng-click='transactions()']"));
        deposits.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
    }
    }
