package technostudyB7.day9.IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import technostudyB7.Utilities.UtilityClass;


public class IFrame3 extends UtilityClass {
    public static void main(String[] args) {
        /*1. Type your name in the input box
         * 2.CLick the check-Box
         * 3.Print header "Not a Friendly Topic
         * 4. choose the 3rd element from the dropDown menu
         * and print*/
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);

        WebElement topicInput = driver.findElement(By.tagName("input"));
        topicInput.sendKeys("John Cena");

        driver.switchTo().frame(0);
        WebElement CheckBox = driver.findElement(By.id("a"));
        CheckBox.click();


        driver.switchTo().defaultContent().switchTo().frame(1);

        WebElement dropDown= driver.findElement(By.className("col-lg-3"));
        dropDown.click();

        Select select= new Select(dropDown);
        select.selectByValue("big baby cat");

        driver.switchTo().defaultContent();

        WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println("Header Text= " + header.getText());

    }
}
