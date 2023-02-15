package technostudyB7.day6.Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Xpath {
    public static void main(String[] args) {
        /*1.For CSSSelector we used: tagName[attribute='value']
        * 2.For xpath we use: //tagName[@attribute='value']   ---> double forward slash'//'its called "RELATIVE XPATH"
        * and one forward slash'/'its called "ABSOLUTE XPATH" (needs to start from the beginning /html....)*/


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.worldometers.info/world-population/");

        WebElement wordPopulationTitle= driver.findElement(By.xpath("//div[@id='maincounter-wrap']//h1"));
        System.out.println(wordPopulationTitle.getText());

        WebElement worldPopulationNumber= driver.findElement(By.xpath("//span[@class='rts-counter']"));
        System.out.println(worldPopulationNumber.isDisplayed());
    }
}
