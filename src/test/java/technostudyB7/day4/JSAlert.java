package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSAlert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*Test Case #1:
         * 1.Visit Page
         * 2. Click on JS Alert
         * 3.Get text.
         * 4. Click 'Ok'*/

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");


        System.out.println("\n---------JS ALERT-------");
        /*Click for JS Alert "CODE":
        <button onclick="jsAlert()">Click for JS Alert</button>*/
        WebElement jsAlert = driver.findElement(By.cssSelector("button[onclick='jsAlert()'"));
        jsAlert.click();


        // it will give me the text of the Alert Msg
        String jsAlertText = driver.switchTo().alert().getText();
        System.out.println("The 'JS Alert' says: " + jsAlertText);

        // It will click on button:
        driver.switchTo().alert().accept();


        System.out.println("\n---------JS CONFIRM--------");
        /*Click for JS Confirm Code:
         * <button onclick="jsConfirm()">Click for JS Confirm</button>*/

        WebElement jsConfirm = driver.findElement(By.cssSelector("button[onclick='jsConfirm()'"));
        jsConfirm.click();
        String jsConfirmText = driver.switchTo().alert().getText();
        System.out.println("The Text 'JS Alert Confirm' is : " + jsConfirmText);

        driver.switchTo().alert().dismiss();

        System.out.println("\n-------JS Alert Prompt------");

        /*Click for js Prompt:
        <button onclick="jsPrompt()">Click for JS Prompt</button>*/

        WebElement jsPrompt = driver.findElement(By.cssSelector("button[onclick='jsPrompt()'"));
        jsPrompt.click();
        driver.switchTo().alert().sendKeys("Im an SDET");
        driver.switchTo().alert().accept();
        /*Text executed code:
        * <p id="result" style="color:green">You entered: Im an SDET</p>*/
       WebElement textSays= driver.findElement(By.cssSelector("p[id='result'"));

        System.out.println("The prompt Text says: "+"\'"+textSays.getText()+"\'");


        driver.quit();


    }
}
