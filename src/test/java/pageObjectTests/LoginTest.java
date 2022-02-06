package pageObjectTests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest extends BaseTest{
    private int count = 0;
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void flakyTest(){
        if(count++<2){
            Assert.assertTrue(false);
        }
        Assert.assertTrue(true);
    }
    @Test
    public void login_correctCredentials_mainPageOpened(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void login_incorrectCredentials_redFrame(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp("Wrong@cred.com","Credentials");
        Assert.assertTrue(loginPage.errorFrame());
    }
    @Test
    public void login_correctCredentials_mainPageOpened1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void login_incorrectCredentials_redFrame1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp("Wrong@cred.com","Credentials");
        Assert.assertTrue(loginPage.errorFrame());
    }
    @Test
    public void login_correctCredentials_mainPageOpened2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void login_incorrectCredentials_redFrame2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp("Wrong@cred.com","Credentials");
        Assert.assertTrue(loginPage.errorFrame());
    }
    @Test
    public void login_correctCredentials_mainPageOpened3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void login_incorrectCredentials_redFrame3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        loginPage.loginToApp("Wrong@cred.com","Credentials");
        Assert.assertTrue(loginPage.errorFrame());
    }
}
