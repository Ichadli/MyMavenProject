package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WaitByTryCatch {
    public static void main(String[] args){
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



        /*Hidden Text code:
         * <div id="finish" style=""><h4>Hello World!</h4></div>*/

        String text= "";
        int count= 0;

        while( text.equals("")) {
          try{
              WebElement hiddenText= driver.findElement(By.cssSelector("#finish>h4"));
              text= hiddenText.getText();

          }
          catch(NoSuchElementException ex){
              count++;


            }

        }

        System.out.println("The hidden text is : "+"\'"+text+"\'");
        System.out.println(count);

        driver.quit();



    }
}
