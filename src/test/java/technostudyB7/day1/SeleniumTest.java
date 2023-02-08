package technostudyB7.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1- browser driver set up
        WebDriverManager.chromedriver().setup();

        //2- create object of ChromeDriver to open the browser
            // WebDriver is an Interface
            //ChromeDriver is a Class
        WebDriver driver = new ChromeDriver();

        //3- go to google page
       driver.get("https://www.google.com");

        System.out.println("title of google="+driver.getTitle());
        System.out.println("Url of google="+driver.getCurrentUrl());

        driver.navigate().to("https://www.techno.study");
        String expectedTitle= "Join the best coding bootcamps online and get IT training in the US";

       String actualTitle= driver.getTitle();

       if (expectedTitle.equals(actualTitle)){
           System.out.println("PASS");
           System.out.println("Actual Title= "+actualTitle);

       }else System.out.println("FAILED");
        System.out.println("Actual Title= "+actualTitle);



    }
}
