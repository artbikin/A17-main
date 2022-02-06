package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.TemporalUnit;

public class Login {
    private WebDriver driver;
    private WebDriverWait wait;

//    @BeforeMethod
//    public void startUp(){
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        driver = new ChromeDriver();
////        wait = new WebDriverWait(driver,Duration.ofSeconds(5),Duration.ofMillis(200));
//        wait = new WebDriverWait(driver,5,200);
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        String url = "https://bbb.testpro.io";
//        driver.get(url);
//    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void login_correctCredentials_loginToApp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver,Duration.ofSeconds(5),Duration.ofMillis(200));
        wait = new WebDriverWait(driver,5,200);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String url = "https://bbb.testpro.io";
        driver.get(url);

        By emailFieldLocator = By.xpath("//*[@type='email']");

        wait.until(ExpectedConditions.visibilityOfElementLocated(emailFieldLocator));
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);
//        driver.findElement(By.tagName("button")).click();

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        By homeLocator = By.className("home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeLocator));
        boolean result = false;
        try {
            WebElement homeIcon = driver.findElement(homeLocator);
            result = true;
        } catch (NoSuchElementException err){

        }
        Assert.assertTrue(result);
    }

    @Test
    public void login_incorrectCredentials_redFrameDisplayed() throws InterruptedException {
        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        By passwordFieldLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordFieldLocator);

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("koeluser06@testpro.io");
        passwordField.sendKeys("wrongPassword");
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));

        WebElement errorFrame = driver.findElement(By.cssSelector(".error"));
        Assert.assertTrue(errorFrame.isDisplayed());
    }
}
