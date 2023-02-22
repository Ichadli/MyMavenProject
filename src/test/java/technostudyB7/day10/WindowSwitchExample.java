package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;
import java.util.Set;

public class WindowSwitchExample extends UtilityClass {
    public static void main(String[] args) {
        /*1. go to "https://www.selenium.dev/"
         * 2. Click on all the links that opens up on a new tab
         * 3. print their titles and then close tabs */

        driver.get("https://www.selenium.dev/");

        String mainPageId = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));


//        if we want to see each one step by step we can combine the codes together/one by one
//        we opened the links and got the titles one by one


//          for (WebElement link : links) {
//            if (!link.getAttribute("href").contains("mailto")) {
//                link.click();
//        Set<String> idList = driver.getWindowHandles();
//
//
//        for (String id : idList) {
//            if (!id.equals(mainPageId)) {
//                driver.switchTo().window(id);
//                System.out.println(driver.getTitle());
//                driver.close();
//            }
//
//            Wait(2);
//        }


//            }
//        }





        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mailto")) {
                link.click();
            }
        }

        Set<String> idList = driver.getWindowHandles();


        for (String id : idList) {
            if (!id.equals(mainPageId)) {
                driver.switchTo().window(id);
                System.out.println(driver.getTitle());
                driver.close();
            }

            Wait(2);
        }

        driver.switchTo().window(mainPageId);
        System.out.println(driver.getTitle());

        driver.close();
        driver.quit();
    }
}
