package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PresenceOfElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.seleniumeasy.com");

        WebDriverWait wait= new WebDriverWait(driver,10);

        /*testNG code:
        * <a href="/testng-tutorials" title="">TestNG</a>*/
        WebElement TestNGButton= driver.findElement(By.linkText("TestNG"));
        TestNGButton.click();

        /*Heading1
       <div class="section-title">
        <h1>TestNG Tutorials</h1>
		</div>*/
        WebElement TestNGText =driver.findElement(By.cssSelector(".section-title>h1"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".section-title>h1")));
        System.out.println("Text Is= "+TestNGText.getText());




    }
}
