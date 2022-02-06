package helper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void get(WebDriver driver, String filename){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        double x = 5.69;
//        int y = (int)x; // y=5
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("./screenshots/"+filename+".png"));
        }catch (IOException e){}
    }
}
