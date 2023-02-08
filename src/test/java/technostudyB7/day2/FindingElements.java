package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        // Creating an OBJECT "driver"
        WebDriver driver = new ChromeDriver();

        // get() method waits for the page to load
        driver.get("https://www.techno.study");
        Thread.sleep(2000);

        // navigate.() method doesn't wait for the page to load
        driver.navigate().to("https://www.facebook.com");

        //back() method goes to the previous page
        driver.navigate().back();

        // forward() method goes to the upcoming page
        driver.navigate().forward();

        //Finding the webelement on facebook page ( Connect with friends and the world around you on Facebook.)

        WebElement sloganText = driver.findElement(By.className("_8eso"));

        String expectedSloganText = "Connect with friends and the world around you on Facebook.";
        String actualSloganText = sloganText.getText();

        if(expectedSloganText.equals(actualSloganText)){
            System.out.println("Verification: ✅PASSED✅");
    } else {
            System.out.println("Verification: ❗️FAILED❗");
            System.out.println("Actual Result is: "+"\'"+actualSloganText+"\'");
        }
    }
}
