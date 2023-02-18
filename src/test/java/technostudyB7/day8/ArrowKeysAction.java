package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.Utilities.UtilityClass;

public class ArrowKeysAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        /**
         * Move to element
         * click on the element
         * Type "b"
         * press down on arrow key
         * press enter key*/

        /*<div id="autoCompleteMultiple"><span>Type multiple color names</span><div class=" css-2b097c-container"
        id="autoCompleteMultipleContainer"><div class="auto-complete__control css-yk16xz-control"><div
        class="auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3"><div
         class="auto-complete__placeholder css-1wa3eu0-placeholder"></div><div class="css-1g6gooi"><div
         class="auto-complete__input" style="display: inline-block;"><input autocapitalize="none"
         autocomplete="off" autocorrect="off" id="autoCompleteMultipleInput" spellcheck="false" tabindex="0"

         */
        WebElement input= driver.findElement(By.id("autoCompleteMultipleContainer"));
        Actions actions= new Actions(driver);

        Action typeBAction= actions.moveToElement(input).click().sendKeys("b").build();
        typeBAction.perform();

        Action arrowKeyAction= actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        arrowKeyAction.perform();



        quiteDriver(4);

    }
}
