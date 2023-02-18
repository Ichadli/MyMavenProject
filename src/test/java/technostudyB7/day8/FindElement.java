package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;


import java.util.List;


public class FindElement extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");
        List<WebElement> videoTitles = driver.findElements(By.id("video-title"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        System.out.println(videoTitles.get(10).getText());
    }
}
