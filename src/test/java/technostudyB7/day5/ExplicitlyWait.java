package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        /*Start button CODE:
         *<div id="start">
        <button>Start</button>
        </div> */
        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        /*Finish text code:
        * <div id="finish" style="">
        <h4>Hello World!</h4>
        </div>*/

        /*New wait Method (Explicitly wait):
        1.Create 'NEW' object
        2. then we add a certain type of 'Expected Condition', like in this Example we used  ExpectedCondition.visibilityof*/
        WebDriverWait wait = new WebDriverWait(driver, 10);


        WebElement finishText = driver.findElement(By.cssSelector("#finish>h4"));
        wait.until(ExpectedConditions.visibilityOf(finishText));
        System.out.println(finishText.getText());


    }

}
