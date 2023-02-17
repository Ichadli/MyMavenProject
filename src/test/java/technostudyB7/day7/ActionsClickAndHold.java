package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ActionsClickAndHold extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement washington= driver.findElement(By.id("box3"));


        /*<div id="box103" class="dragableBoxRight">United States</div>*/
        WebElement USA= driver.findElement(By.id("box103"));


        // Different way of Drag&Drop

        Actions actions= new Actions(driver);

        Action clickAndHoldWashington= actions.clickAndHold(washington).build();
        clickAndHoldWashington.perform();

        Action moveWashington= actions.moveToElement(USA).release().build();
        moveWashington.perform();

        // In this example we will combine both codes in one line
        Thread.sleep(10);
        WebElement copenhagen= driver.findElement(By.id("box4"));

        WebElement denmark= driver.findElement(By.id("box104"));

        Action clickAndHoldCopenhagen=
                actions.clickAndHold(copenhagen).moveToElement(denmark).release().build();
        clickAndHoldCopenhagen.perform();




    }
}
