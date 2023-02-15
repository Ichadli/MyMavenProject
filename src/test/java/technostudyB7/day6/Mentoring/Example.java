package technostudyB7.day6.Mentoring;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Example {
    public static void main(String[] args) {
        /*
         * Navigate to "http://tutorialsninja.com/demo/"
         * Click on Laptops & Notebooks
         * Click on Show All Laptops & Notebooks
         * Sort the products according to their price(Lowest first)
         * Click on the second one.
         * Click on the add to cart
         * check if you see the success message
         * */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://tutorialsninja.com/demo/");
        /*laptop & Notebook code:
        <a href="http://tutorialsninja.com/demo/index.php?route=product/category&amp;path=18"
        class="dropdown-toggle" data-toggle="dropdown">Laptops &amp; Notebooks</a>
        */

        WebElement laptopsAndNotebooks = driver.findElement(By.linkText("Laptops & Notebooks"));
        laptopsAndNotebooks.click();

        /*2nd code:
        * <a href="http://tutorialsninja.com/demo/index.php?route=product/category&amp;path=18"
        * class="see-all">Show All Laptops &amp; Notebooks</a>*/
         WebElement showAllLaptops= driver.findElement(By.linkText("Show All Laptops & Notebooks"));
         showAllLaptops.click();

         WebElement sortButton= driver.findElement(By.id("input-sort"));
         Select sortButtonSelect=  new Select(sortButton);

         /*#input-sort > option:nth-child(4)*/
         sortButtonSelect.selectByVisibleText("Price (Low > High)");

         WebElement secondProduct= driver.findElement(By.linkText("MacBook"));
         secondProduct.click();

         WebElement addToCart= driver.findElement(By.id("button-cart"));
         addToCart.click();

         /*Success msg Code:
         * <div class="alert alert-success alert-dismissible">Success: You have added
         * <a href="http://tutorialsninja.com/demo/index.php?route=product/product&amp;product_id=43">MacBook</a>
         *  to your <a href="http://tutorialsninja.com/demo/index.php?route=checkout/cart">shopping cart</a>!<button type="button"
         *  class="close" data-dismiss="alert">×</button></div>*/

        WebElement alertMsg= driver.findElement(By.cssSelector("div[id='product-product']> div"));

        System.out.println("Success msg text: "+alertMsg.getText());



    }
}
