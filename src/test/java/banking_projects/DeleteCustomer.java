package banking_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DeleteCustomer extends Login{
    @Test
    public void DeleteCustomer() throws InterruptedException {
        managerlogin();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[ng-click='showCust()']"))).sendKeys(Keys.RETURN);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control"))).sendKeys("Ron");
        Thread.sleep(1000);
        WebElement Deletecustomer = driver.findElement(By.cssSelector("button[ng-click='deleteCust(cust)']"));
        Deletecustomer.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }
}
