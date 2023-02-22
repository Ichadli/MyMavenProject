package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.Utilities.UtilityClass;

public class Scroll2 extends UtilityClass {
    public static void main(String[] args) {


        driver.get("https://triplebyte.com/");
        Wait(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scrolled to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Wait(2);
        //Scrolled to the top of the page
        js.executeScript("window.scrollTo(0, 0)");


    }
}
