package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        //Test Case:

        /*1.visit page
         * 2. verify if the hidden text is displayed
         * 3.click on button
         * 4.Verify if the hidden test is displayed*/


        //Button Code
        /*<div id="start">
        <button>Start</button>
        </div>*/

        //Text Code after clicking the button
        /*<div id="finish" style="">
         <h4>Hello World!</h4>
         </div>*/

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        WebElement hiddenText = driver.findElement(By.cssSelector("#finish>h4"));
        System.out.println("----------Before Clicking button---------");
        System.out.println("Is Hidden Text Displayed?= "+hiddenText.isDisplayed());

        System.out.println("\n------After Clicking Button-------");
        startButton.click();
        Thread.sleep(5000);
        System.out.println("Is Hidden Text Displayed?= "+hiddenText.isDisplayed());




        driver.quit();


    }
}
