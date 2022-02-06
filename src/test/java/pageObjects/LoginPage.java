package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class LoginPage extends BasePage{
    private static Logger logger = LogManager.getLogger(LoginPage.class);
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getUserField(){
        By usernameLocator = By.xpath("//*[@type='email']");
        return driver.findElement(usernameLocator);
    }

    private WebElement getPasswordField(){
        return driver.findElement(By.cssSelector("[type='password']"));
    }

    private WebElement getLoginButton(){
        return driver.findElement(By.tagName("button"));
    }

    private WebElement getErrorFrame(){
        By errorLocator = By.className("error");
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorLocator));
        return driver.findElement(errorLocator);
    }

    public void open(String url){
        driver.get(url);
    }
    public MainPage loginToApp(String username, String password){
        logger.info("Logging to app using: "+username+" password: "+password);
        getUserField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        logger.debug("Clicked login button");
        return new MainPage(driver);
    }

    public boolean errorFrame() {
        try {
            return getErrorFrame().isDisplayed();
        } catch (TimeoutException err){
            logger.fatal("Something went wrong "+err.getLocalizedMessage());
            return false;
        }
    }
}
