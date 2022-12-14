package banking_projects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.DriverClass;

public class CustomerOnboarding extends Login {
    public void alertpopups() throws InterruptedException {
        // Switching to Alert
        Alert alert = driver.switchTo().alert();
        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();
        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);
        // Accepting alert
        alert.accept();
    }
    @Test(priority=1, enabled = true)
 public void AddCustomer() throws InterruptedException {
        managerlogin();
        Thread.sleep(30000);
        WebElement addcustomer = driver.findElement(By.cssSelector("button[ng-click='addCust()']"));
        addcustomer.sendKeys(Keys.RETURN);
        // verify new url and compare the url
        //String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust";
       //String actualUrl = driver.getCurrentUrl();
        //Assert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the same as Expected url");

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       Thread.sleep(3000);
      WebElement Firstname = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")));
       Firstname.sendKeys("Ven");
        WebElement Lastname = driver.findElement(By.cssSelector("input[ng-model='lName']"));
        Lastname.sendKeys("Mogati");
        WebElement Postaladdress = driver.findElement(By.cssSelector("input[ng-model='postCd']"));
        Postaladdress.sendKeys("515 Kiss");
        WebElement Submit = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        Submit.sendKeys(Keys.RETURN);
        this.alertpopups();
    }
    @Test(priority=2, enabled = true)
    public void addcustomernegative1() throws InterruptedException {
        managerlogin();
        Thread.sleep(2000);
        WebElement addcustomer = driver.findElement(By.cssSelector("button[ng-click='addCust()']"));
        addcustomer.sendKeys(Keys.RETURN);

        Thread.sleep(3000);
        WebElement Firstname = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")));
        Firstname.sendKeys("");
        //WebElement Lastname = driver.findElement(By.cssSelector("input[ng-model='lName']"));
       // Lastname.sendKeys("Mogati");
       // WebElement Postaladdress = driver.findElement(By.cssSelector("input[ng-model='postCd']"));
        //Postaladdress.sendKeys("515 Kiss");
        WebElement Submit = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        Submit.sendKeys(Keys.RETURN);
    }
    @Test(priority=2, enabled = true)
public void OpenAccount() throws InterruptedException {
        Thread.sleep(2000);
    WebElement openAccount = driver.findElement(By.cssSelector("button[ng-click='openAccount()']"));
    openAccount.sendKeys(Keys.RETURN);
    Thread.sleep(2000);
        Select dropName = new Select(driver.findElement(By.id("userSelect")));
        dropName.selectByVisibleText("Ven Mogati");
        Select currency = new Select(driver.findElement(By.id("currency")));
        currency.selectByVisibleText("Dollar");
        WebElement Process = driver.findElement(By.cssSelector("button[type='submit']"));
        Process.sendKeys(Keys.RETURN);
        this.alertpopups();
    }
        @Test(priority = 3, enabled = true)
    public void DeleteCustomer() throws InterruptedException {
        Thread.sleep(3000);
            WebElement Customers = driver.findElement(By.cssSelector("button[ng-click='showCust()']"));
            Customers.sendKeys(Keys.RETURN);
            Thread.sleep(3000);
            //Assert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the same as Expected url");
            //WebElement SearchCustomer = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-touched']"));
            //WebElement SearchCustomer = driver.findElement(By.cssSelector("input[ng-model='searchCustomer']"));
           //SearchCustomer.sendKeys("Granger");
            WebElement SearchCustomer = driver.findElement(By.className("form-control"));
            SearchCustomer.sendKeys("Ven");
           // WebElement Deletecustomer = driver.findElement(By.cssSelector("button[ng-click='deleteCust(cust)']"));
            //Deletecustomer.sendKeys(Keys.RETURN);
    }

}