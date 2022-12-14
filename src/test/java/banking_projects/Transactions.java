package banking_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.DriverClass;

public class Transactions extends Login {

  // Login loginPath = new Login();
   //@BeforeTest
   //public void loadWebPage(){
     //  String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
      // driver.get(url);
      // driver.manage().window().maximize();
       //loginPath.managerlogin();
//}
@Test
public void Deposits() throws InterruptedException {
    Customerlogin();
       Thread.sleep(2000);
    WebElement customerLogin = driver.findElement(By.cssSelector("button[ng-click='deposit()']"));
    customerLogin.sendKeys(Keys.RETURN);
   // WebElement Amount = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
    Thread.sleep(2000);
    WebElement Amount = driver.findElement(By.cssSelector("input[ng-model='amount']"));
    Amount.sendKeys("5000");
    WebElement Deposit = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
    Deposit.sendKeys(Keys.RETURN);
}
@Test
public void logout() throws InterruptedException {
    Customerlogin();
    Thread.sleep(2000);
    WebElement logout = driver.findElement(By.className("logout"));
    logout.sendKeys(Keys.RETURN);
}
}
