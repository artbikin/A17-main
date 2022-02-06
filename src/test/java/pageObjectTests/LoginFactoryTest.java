package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPageFactory;
import pageObjects.MainPage;

public class LoginFactoryTest extends BaseTest{
    @Test
    public void loginFactory_correctCredentials(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginFactory_incorrectCredentials(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        loginPageFactory.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPageFactory.isError());
    }
    @Test
    public void loginFactory_correctCredentials1(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginFactory_incorrectCredentials1(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        loginPageFactory.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPageFactory.isError());
    }
    @Test
    public void loginFactory_correctCredentials2(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginFactory_incorrectCredentials2(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        loginPageFactory.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPageFactory.isError());
    }
    @Test
    public void loginFactory_correctCredentials3(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }
    @Test
    public void loginFactory_incorrectCredentials3(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        loginPageFactory.loginToApp(username,"wrongPassword");
        Assert.assertTrue(loginPageFactory.isError());
    }

}
