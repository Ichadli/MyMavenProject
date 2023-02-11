package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetNotPresentElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        /*Test Case:
        * 1. visit the page/
          2. get the text of the hidden text(Hello World!)*/



        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        /*StartButton Code=
        * <div id="start">
    <button>Start</button>
  </div>*/

       WebElement startButton=  driver.findElement(By.cssSelector("#start>button"));
       startButton.click();
        Thread.sleep(Duration.ofSeconds(5));

       /*Hidden Text code:
       * <div id="finish" style=""><h4>Hello World!</h4></div>*/

        WebElement hiddenText= driver.findElement(By.cssSelector("#finish>h4"));


        System.out.println("Is hidden text displayed? : "+hiddenText.isDisplayed());
        System.out.println("The hidden text is : "+"\'"+hiddenText.getText()+"\'");




















    }
}
