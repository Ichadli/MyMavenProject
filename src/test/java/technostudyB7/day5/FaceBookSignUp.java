package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FaceBookSignUp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");

        /*Create account Button CODE:
        * <a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify="/reg/spotlight/"
        * id="u_0_0_YG" data-testid="open-registration-form-button" rel="async">Create new account</a>*/

        WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        /*Frist name Code:
        * <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value=""
        *  aria-required="true" placeholder="" aria-label="First name" id="u_a_b_qI" tabindex="0"
        * aria-describedby="js_d5">*/
        WebElement firstName= driver.findElement(By.cssSelector("input[name='firstname'"));
        firstName.sendKeys("Steve");

        /*Last name Code:
        * <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value=""
        * aria-required="true" placeholder="" aria-label="Last name" id="u_a_d_bz">*/
        WebElement lastName= driver.findElement(By.cssSelector("input[name='lastname'"));
        lastName.sendKeys("Philips");

        /*Mobile Number or Email Code:
        * <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value=""
        *  aria-required="true" placeholder="" aria-label="Mobile number or email" id="u_a_g_v8">*/
        WebElement mobileNumber= driver.findElement(By.cssSelector("input[aria-label='Mobile number or email'"));
        mobileNumber.sendKeys("6142859409");

        /*Password Code:
        * <input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password"
        *  name="reg_passwd__" id="password_step_input" aria-required="true" placeholder="" aria-label="New password">*/
        WebElement passWord= driver.findElement(By.cssSelector("input[arial-label='New password'"));
        passWord.sendKeys("Jouik1139!#");

        /*Month DropDown Code:
        * <select aria-label="Month" name="birthday_month" id="month" title="Month" class="_9407 _5dba _9hk6 _8esg">
        <option value="1">Jan</option>
        * <option value="2" selected="1">Feb</option>
        * <option value="3">Mar</option>
        * <option value="4">Apr</option>
        * <option value="5">May</option>
        * <option value="6">Jun</option>
        * <option value="7">Jul</option>
        * <option value="8">Aug</option>
        * <option value="9">Sep</option><
        * option value="10">Oct</option>
        * <option value="11">Nov</option>
        * <option value="12">Dec</option>
        * </select>*/




    }
}
