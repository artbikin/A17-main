package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver){
        super(driver);
    }

    private WebElement getHomeIcon(){
        By homeLocator = By.className("home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeLocator));
        return driver.findElement(homeLocator);
    }
    public boolean isOpen() {
        try {
            return getHomeIcon().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }

    private void clickPlusButton(){
        By plusLocator = By.className("fa-plus-circle");
        for (int i = 0;i<20;i++){
            try{
                driver.findElement(plusLocator).click();
                break;
            } catch (NoSuchElementException | ElementClickInterceptedException err){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e){}
            }
        }
    }

    private WebElement getNewPlaylistItem(){
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getNewPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }


    public String createPlaylist(String playlistName) {
        clickPlusButton();
        getNewPlaylistItem().click();
        getNewPlaylistField().sendKeys(playlistName);
        getNewPlaylistField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("success")));
        return driver.getCurrentUrl().split("/")[5];
    }
    private WebElement getPlaylist(String playlistId){
        By playlistLocator = By.xpath("//*[@href='#!/playlist/"+playlistId+"']");
        return driver.findElement(playlistLocator);
    }

    public boolean playlistExist(String playlistId, String playlistName) {
        try {
            return getPlaylist(playlistId).getText().equals(playlistName);
        } catch (NoSuchElementException err) {
            return false;
        }
    }

    private WebElement getEditField(){
        By locator = By.xpath("//*[@class = 'playlist playlist editing']/input");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }
    public void renamePlaylist(String playlistId, String newName) {
        WebElement playlist = getPlaylist(playlistId);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", playlist);

        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();

        getEditField().sendKeys(Keys.CONTROL+"A");
        getEditField().sendKeys(newName);
        getEditField().sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show' and contains(text(),'"+newName+"')]")));
    }
}

