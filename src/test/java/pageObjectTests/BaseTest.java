package pageObjectTests;

import enums.BrowserType;
import helper.BrowserFabric;
import helper.Screenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String url;
    protected String username;
    protected String password;

    @Parameters({"url","username","password","browser"})
    @BeforeMethod
    public void startUp(String url,String username, String password, String browser){
        System.out.println("-------------------"+browser);
        this.username=username;
        this.password=password;

        BrowserType browserType = browser.equals("chrome") ? BrowserType.CHROME : BrowserType.FIREFOX;

//        BrowserType browserType;
//        if(browser.equals("chrome")){
//            browserType = BrowserType.CHROME;
//        } else {
//            browserType = BrowserType.FIREFOX;
//        }

        driver = BrowserFabric.getDriver(browserType);
        this.url = url;

    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            Screenshot.get(driver,iTestResult.getName());
        }
        driver.quit();
    }
}
