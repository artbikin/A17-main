package pageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPageFactory {
    private WebDriver driver;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(driver,this);
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,5);
        PageFactory.initElements(factory,this);
    }

    @FindBy(css="[type=email]")
    private WebElement usernameField;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement passwordField;

    @FindBy(tagName = "button")
    private WebElement loginButton;

    @FindBy(className = "error")
    private WebElement errorFrame;


    public boolean isError(){
        try {
            return errorFrame.isDisplayed();
        } catch (TimeoutException e){
            return false;
        }
    }
    public void open(String url){
        driver.get(url);
    }
    public MainPage loginToApp(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        return new MainPage(driver);
    }





}
