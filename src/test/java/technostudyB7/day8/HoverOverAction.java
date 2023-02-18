package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

public class HoverOverAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");
        /**
         * Hover over jewelery
         * earings
         * click on Clip-on Earrings
         * Check if the url has Clip-on Earrings
         * */
        /*Jewelery CODE:
        * <span id="catnav-primary-link-10855" class="wt-text-black" role="menuitem" aria-haspopup="true" tabindex="0">

                               Jewelry &amp; Accessories

                       </span>*/
        WebElement jewelery = driver.findElement(By.id("catnav-primary-link-10855"));
        Actions actions = new Actions(driver);
        Action hoverOverJeweleryAction = actions.moveToElement(jewelery).build();
        hoverOverJeweleryAction.perform();

        WebDriverWait wait= new WebDriverWait(driver,10);


        WebElement earrings= driver.findElement(By.xpath("//span[@id='side-nav-category-link-10896']"));
        wait.until(ExpectedConditions.visibilityOf(earrings));
        Action hoverOverEarringAction= actions.moveToElement(earrings).build();
        hoverOverEarringAction.perform();

        /*Clip-On Earrings Code:
        * <a id="catnav-l3-10904" class="wt-display-block wt-text-black wt-text-link-no-underline "
        *  href="/c/jewelry/earrings/clip-on-earrings?ref=catnav-10855" role="menuitem" tabindex="-1">
                                    Clip-On Earrings
                                </a>*/
        WebElement clipOnEarrings= driver.findElement(By.id("catnav-l3-10904"));
        clipOnEarrings.click();

        String CurrentUrl= driver.getCurrentUrl();
        System.out.println(CurrentUrl.contains("clip-on-earrings"));

        quiteDriver(4);
    }
}
