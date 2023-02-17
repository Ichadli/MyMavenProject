package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ActionsDragAndDrop extends UtilityClass {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        /*CODE1:
        * <div class="dragableBox" id="box3" dragableelement="2"
        * style="visibility: visible;">Washington</div>*/
        WebElement washington= driver.findElement(By.id("box3"));

        System.out.println("Initial Background-color= "+washington.getCssValue("background-color"));

        /*<div id="box103" class="dragableBoxRight">United States</div>*/
        WebElement USA= driver.findElement(By.id("box103"));

        Actions actions= new Actions(driver);
        Action dragAndDropWashington= actions.dragAndDrop(washington,USA).build();
        dragAndDropWashington.perform();

        System.out.println("The last Initial BG-Color"+washington.getCssValue("background-color"));

        WebElement copenhagen= driver.findElement(By.id("box4"));

        WebElement denmark= driver.findElement(By.id("box104"));

        Action dragAndDropCopenhagen= actions.dragAndDrop(copenhagen,denmark).build();
        dragAndDropCopenhagen.perform();

        //
    }
}
