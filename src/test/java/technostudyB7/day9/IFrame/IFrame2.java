package technostudyB7.day9.IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class IFrame2 extends UtilityClass {
    public static void main(String[] args) {
        /*1. Type your name in the input box
         * CLick the check-Box
         * Print header "Not a Friendly Topic*/
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement topicInput = driver.findElement(By.tagName("input"));
        topicInput.sendKeys("John Cena");

        driver.switchTo().frame(0);
        WebElement CheckBox = driver.findElement(By.id("a"));
        CheckBox.click();

        driver.switchTo().defaultContent();

        WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println("Header Text= " + header.getText());
    }
}
