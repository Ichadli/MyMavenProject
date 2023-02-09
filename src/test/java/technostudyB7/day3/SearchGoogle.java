package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        /*ActualTitle= <title>bamboo pen - Google Search</title>*/

        /*1.Go to google page
        * 2. locate search box
        * 3.send bamboo pen keys to the box
        * 4.get the title of the new open page
        * 5.do verification with actual/Expected*/

        /*Search box Code:

         <input class="gLFyf" jsaction="paste:puy29d;"
        maxlength="2048" name="q" type="text" aria-autocomplete="both"
        aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off"
         autofocus="" role="combobox" spellcheck="false" title="Search" value=""
         aria-label="Search" data-ved="0ahUKEwjNjPLan4f9AhWblokEHd4KA9YQ39UDCAc">*/

        String input="Bamboo pen";
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys(input+ Keys.ENTER);

        //Verification

        String actualTitle= driver.getTitle();
        String expctTitle= "Bamboo pen - Google Search";

        if (actualTitle.equals(expctTitle)) {
            System.out.println("Verification is: ✅PASSED✅");
            System.out.println("Actual Title Is: "+ "\'"+actualTitle+ "\'");
        } else {
            System.out.println("Verification is: ❗️FAILED❗");
            System.out.println("Actual Result is: " + "\'" + actualTitle + "\'");
        }
    }
}
