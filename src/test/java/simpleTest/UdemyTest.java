package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UdemyTest {
    @Test
    public void searchForJava() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.udemy.com");
        Thread.sleep(2000);

        WebElement searchField = driver.findElement(By.xpath("(//*[@name='q'])[1]"));
        searchField.sendKeys("java");
        searchField.sendKeys(Keys.RETURN);



        Thread.sleep(5000);
        driver.close();

    }
}
