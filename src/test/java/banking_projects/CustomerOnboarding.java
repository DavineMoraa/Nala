package banking_projects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.DriverClass;

import java.time.Duration;

public class CustomerOnboarding extends Login {
    public void alertpopups() throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(2000);
        alert.accept();
    }

    @Test(priority = 1, enabled = true)
    public void AddCustomerPositiveTest() throws InterruptedException {
        managerlogin();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[ng-click='addCust()']"))).sendKeys(Keys.RETURN);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"))).sendKeys("Dina");
        WebElement Lastname = driver.findElement(By.cssSelector("input[ng-model='lName']"));
        Lastname.sendKeys("Kemunto");
        WebElement Postaladdress = driver.findElement(By.cssSelector("input[ng-model='postCd']"));
        Postaladdress.sendKeys("515 Kiss");
        WebElement Submit = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        Submit.sendKeys(Keys.RETURN);
        this.alertpopups();
    }

    @Test(priority = 2, enabled = true)
    public void addcustomernegative() throws InterruptedException {
        managerlogin();
        Thread.sleep(3000);
        WebElement Addcustomer = driver.findElement(By.cssSelector("button[ng-click='addCust()']"));
       Addcustomer.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        WebElement Firstname = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"));
        Firstname.sendKeys("");
        WebElement Lastname = driver.findElement(By.cssSelector("input[ng-model='lName']"));
        Lastname.sendKeys("");
        WebElement Postaladdress = driver.findElement(By.cssSelector("input[ng-model='postCd']"));
        Postaladdress.sendKeys("515 Kiss");
        WebElement Submit = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        Submit.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
    }

    @Test(priority = 3, enabled = true)
    public void OpenAccountPositiveTest() throws InterruptedException {
        managerlogin();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[ng-click='openAccount()']"))).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        Select dropName = new Select(driver.findElement(By.id("userSelect")));
        dropName.selectByVisibleText("Dina Kemunto");
        Select currency = new Select(driver.findElement(By.id("currency")));
        currency.selectByVisibleText("Dollar");
        WebElement Process = driver.findElement(By.cssSelector("button[type='submit']"));
        Process.sendKeys(Keys.RETURN);
        this.alertpopups();
    }

    @Test(priority = 4, enabled = true)
    public void OpenAccountNegativeTest() throws InterruptedException {
        Thread.sleep(3000);
        WebElement openAccount = driver.findElement(By.cssSelector("button[ng-click='openAccount()']"));
        openAccount.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
       // Select dropName = new Select(driver.findElement(By.id("userSelect")));
       // dropName.selectByVisibleText("Harry Potter");
        //Select currency = new Select(driver.findElement(By.id("currency")));
        //currency.selectByVisibleText("");
        WebElement Process = driver.findElement(By.cssSelector("button[type='submit']"));
        Process.sendKeys(Keys.RETURN);

    }
}