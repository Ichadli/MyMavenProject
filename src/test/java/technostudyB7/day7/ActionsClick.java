package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ActionsClick extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        /*Double Click Button CODE:
        * <button id="doubleClickBtn" type="button"
        * class="btn btn-primary">Double Click Me</button>*/

        WebElement doubleClickBtn= driver.findElement(By.id("doubleClickBtn"));

        //We created an actions object.
        Actions actions= new Actions(driver);

        Action doubleClickAction= actions.doubleClick(doubleClickBtn).build();
        doubleClickAction.perform();

        /*Right Click Button CODE:
        * <button id="rightClickBtn" type="button"
        * class="btn btn-primary">Right Click Me</button>*/
        WebElement rightClickBtn= driver.findElement(By.id("rightClickBtn"));
        Action rightClickAction= actions.contextClick(rightClickBtn).build();
        rightClickAction.perform();

        /*Click Me Button CODE:
        * <button id="n2JrR" type="button"
        * class="btn btn-primary">Click Me</button>*/
        WebElement clickMeBtn= driver.findElement(By.xpath("//button[text()='Click Me']"));
        Action clickMeAction= actions.click(clickMeBtn).build();
        clickMeAction.perform();


        //2nd way of using these Actions:

        //DoubleClick
        Action doubleClickAction2= actions.moveToElement(doubleClickBtn).doubleClick().build();
        doubleClickAction2.perform();

        //RightClick
        Action rightClickAction2= actions.moveToElement(rightClickBtn).doubleClick().build();
        rightClickAction2.perform();

        //Click

        Action clickAction2= actions.moveToElement(clickMeBtn).click().build();
        clickAction2.perform();



    }
}
