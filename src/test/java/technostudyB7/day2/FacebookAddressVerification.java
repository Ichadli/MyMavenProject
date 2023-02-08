package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAddressVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        String email= "ismael.chadli@yahoo.com";
        String passCode= "1234567";





        driver.get("https://www.facebook.com");

        /*Input UserName= <input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
        data-testid="royal_email" placeholder="Email or phone number"
        autofocus="1" aria-label="Email or phone number">*/

       WebElement emailBox = driver.findElement(By.id("email"));
       emailBox.sendKeys(email);

       /*Input Password= <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass"
       id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">*/

       WebElement passBox= driver.findElement(By.cssSelector("input[type='password']"));
       passBox.sendKeys(passCode);


       /*Login Button= <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"
       name="login" data-testid="royal_login_button" type="submit" id="u_0_5_6W">Log In</button>*/

        WebElement loginButton= driver.findElement(By.name("button[name='login']"));
        loginButton.click();

        driver.quit();


    }
}
