package technostudyB7.day3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*1. visit the selenium easy page
         * 2. locate 'Checkbox' element
         * 3. select the checkbox
         * 4. verify if is selected*/

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        /*<input type="checkbox" id="isAgeSelected" value="">*/

        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        checkBox.click();

        if(checkBox.isSelected()){
            System.out.println("PASS✅");
        }else{
            System.out.println("FAIL❌");
        }

        driver.quit();

    }
}
