package technostudyB7.day11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShot extends UtilityClass {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys("Admin");

        WebElement passCode = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passCode.sendKeys("11124");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")));
        WebElement errorMessage = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));

        //Each time we run the code it over Writes the previous screenShot

//        if (errorMessage.isDisplayed()) {
//            TakesScreenshot scrShot = (TakesScreenshot) driver;// got the screenshot
//            File scrShotInMemory = scrShot.getScreenshotAs(OutputType.FILE);// created a file for the screenshot
//            FileUtils.copyFile(scrShotInMemory, new File("src/test/java/technostudyB7/screenShots/screen.png"));
//        }

        if (errorMessage.isDisplayed()) {
            LocalDateTime dateTime= LocalDateTime.now();
            DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM_dd_yyyy_hh_mm_ss_SSS");
            TakesScreenshot scrShot = (TakesScreenshot) driver;// got the screenshot
            File scrShotInMemory = scrShot.getScreenshotAs(OutputType.FILE);// created a file for the screenshot
            FileUtils.copyFile(scrShotInMemory, new File("src/test/java/technostudyB7/screenShots/"+ dateTime.format(formatter)+"screen.png"));
        }


    }
}
