package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;

public class ScrollExample extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {

        /*Go to youtube.com
         * Scroll down until there are at least 100 videos on the page
         * Print the name of the 300th video */

        driver.get("https://www.youtube.com/");
        Wait(3);
        List<WebElement> videoTitles = driver.findElements(By.id("video-title"));
        System.out.println(videoTitles.size());




        while(videoTitles.size()<100){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");
            Wait(3);
            videoTitles = driver.findElements(By.id("video-title"));


        }
        System.out.println(videoTitles.size());
        System.out.println(videoTitles.get(99).getText());
        videoTitles.get(99).click();



//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
//
//        Wait(10);
//
//        videoTitles = driver.findElements(By.id("video-title"));
//        System.out.println(videoTitles.size());



    }
}
