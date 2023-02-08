package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       

        // driver.get("https://demo.seleniumeasy.com/");
        driver.navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        /*<input autofocus="" type="text" class="form-control"
         placeholder="Please enter your Message" id="user-message">*/
        WebElement msg = driver.findElement(By.id("user-message"));

        msg.sendKeys("Hello Selenium");

        /*<button type="button" onclick="showInput();"
        class="btn btn-default">Show Message</button>*/
        WebElement submit = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        submit.click();

        //<span id="display">Hello Selenium</span>
        WebElement result = driver.findElement(By.id("display"));

        String expectedResult = "Hello Selenium";



        if (expectedResult.equals(result.getText())) {
            System.out.println("Verification of MSG: ✅PASSED✅");
        } else {
            System.out.println("Verification of MSG: ❗️FAILED❗");
            System.out.println("Actual Result is: " + "\'" + result.getText() + "\'");
        }




        /*<input type="text" class="form-control" placeholder="Enter value" id="sum1">*/
        WebElement inputA = driver.findElement(By.id("sum1"));
        inputA.sendKeys(Integer.toString(7));

        /*<input type="text" class="form-control" placeholder="Enter value" id="sum2">*/
        WebElement inputB = driver.findElement(By.id("sum2"));
        inputB.sendKeys(Integer.toString(6));

        /*<button type="button" onclick="return total()" class="btn btn-default">Get Total</button>*/
        WebElement getValue = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        getValue.click();

        /*<span id="displayvalue">13</span>*/
        WebElement valueTotal= driver.findElement(By.id("displayvalue"));
        int value1=7;
        int value2=6;
        int sum=value1+value2;

        String expctResult = Integer.toString(sum);


        if (expctResult.equals(valueTotal.getText())) {
            System.out.println("Verification of Value: ✅PASSED✅");
        } else {
            System.out.println("Verification Value: ❗️FAILED❗");
            System.out.println("Actual  Value  is: " + "\'" + valueTotal.getText() + "\'");
        }




    }
}
