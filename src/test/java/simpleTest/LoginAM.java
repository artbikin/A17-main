package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAM {

    //*[@type='email']

    @Test
    public void login_correctCredentials_loginToApp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://bbb.testpro.io";

        String email = "koeluser06@testpro.io";
        String password = "te$t$tudent";

        driver.get(url);

        // find email field with xpath
        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        // find password field with css
        By passwordLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordLocator);

        // find login button by tag name
        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        // log in
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();

        Thread.sleep(3000);

        // check if home icon is on the page
        By homeLocator = By.className("home");
        boolean result = false;
        try {
            WebElement homeIcon = driver.findElement(homeLocator);
            result = true;
        } catch (NoSuchElementException err){

        }

        // Better if test fails on Assert than on Exception
        Assert.assertTrue(result);

        // Thread.sleep(5000);

        // close browser
        // driver.quit();  // useful for multiple windows, will close all
        driver.close();
    }

    @Test
    public void login_incorrectCredentials_redFrameDisplayed() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://bbb.testpro.io";

        String email = "koeluser06@testpro.io";
        String password = "teststudent";

        driver.get(url);

        // find email field with xpath
        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);

        // find password field with css
        By passwordLocator = By.cssSelector("[type='password']");
        WebElement passwordField = driver.findElement(passwordLocator);

        // find login button by tag name
        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        // log in
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();

        Thread.sleep(400);

        // check if home icon is on the page
        By errorFrame = By.cssSelector(".error");
        boolean result = false;
        try {
            WebElement redErrorFrame = driver.findElement(errorFrame);
            result = true;
        } catch (NoSuchElementException err){

        }

        // Better if test fails on Assert than on Exception
        Assert.assertTrue(result);

        // Thread.sleep(5000);

        // close browser
        // driver.quit();  // useful for multiple windows, will close all
        driver.close();

    }


}
