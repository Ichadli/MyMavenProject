package technostudyB7.day9.IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class IFrame extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");


        //This is the CODE, to find the amount of Frames, in-case we couldn't fine any and gives error
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames= "+size);


        // Three ways to locate the IFrame:

        //first way with id (String)
//        driver.switchTo().frame("frame1");

        //Second way: by WebElement:
//        WebElement iFrame= driver.findElement(By.id("frame1"));
//        driver.switchTo().frame(iFrame);

        //ThirdWay is by index:( the best one to USE ):
        driver.switchTo().frame(0);

        WebElement topicInput= driver.findElement(By.tagName("input"));
        topicInput.sendKeys("John Cena");

        // how to go back to the actual Frame:
       // driver.switchTo().parentFrame();  //takes us one step Back
        driver.switchTo().defaultContent(); //takes us to where we started

        WebElement header= driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println("Header Text= "+header.getText());




    }
}
