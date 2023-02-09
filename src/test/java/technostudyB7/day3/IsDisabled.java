package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        /*1. visit the page
         * 2.Locate the enable button
         * 3. Click on the button
         * 4.Verify if its enabled */

        /* From code:
        <form id="input-example">
        <input type="text" disabled="" style="width: 30%;">
        <button autocomplete="off" type="button" onclick="swapInput()">Enable</button>
        </form>*/

        /*To go from parent to child we need to use ("#---->---")
        in this scenario form is the parent which will look like
         ("#input-example>button")*/

        WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));

        WebElement inputField = driver.findElement(By.cssSelector("#input-example>input"));

        boolean isInputFieldEnabled = inputField.isEnabled();

        System.out.println("Before Clicking The 'Enable Button'= "+isInputFieldEnabled);

        enableButton.click();
        Thread.sleep(5000);

        boolean isInputFieldEnabled2= inputField.isEnabled();

        System.out.println("After Clicking The 'Enable Button'= "+isInputFieldEnabled2);


    }
}
