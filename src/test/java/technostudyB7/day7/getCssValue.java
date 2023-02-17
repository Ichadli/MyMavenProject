package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

public class getCssValue extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com");
        WebElement searchInput= driver.findElement(By.id("inputValEnter"));
        //we reached autocomplete Attribute
        System.out.println("getAttribute(autocmplete)= "+searchInput.getAttribute("autocomplete"));

        System.out.println("getAttribute(name)= "+ searchInput.getAttribute("name"));

        System.out.println(searchInput.getAttribute("id"));

        //We got the background Value
        searchInput.getCssValue("background");
        System.out.println("Background Color: "+searchInput.getCssValue("background"));

        //We got the font family css value
        searchInput.getCssValue("font-family");
        System.out.println("Font Family Value: "+searchInput.getCssValue("font-family"));

        searchInput.getCssValue("color");
        System.out.println("The Color Value is: "+searchInput.getCssValue("color"));






    }
}
