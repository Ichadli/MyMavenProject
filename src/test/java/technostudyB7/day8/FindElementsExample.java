package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.List;

public class FindElementsExample extends UtilityClass {
    public static void main(String[] args) {
        /**1- Go to https://www.saucedemo.com/
         2- login with valid credentials
         3- Click on Sauce Labs Backpack and add to the cart
         4- Click on Back To Products
         5- Click on Sauce Labs Bolt T-Shirt and add to the cart
         6- Click on the cart
         7- Click on the Check Out button
         8- Fill the form and click on Continue
         9- Check if you see your products*/

        driver.get("https://www.saucedemo.com/");
        /*UserName Code:
         * <input class="input_error form_input" placeholder="Username" type="text" data-test="username"
         * id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">*/
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        /*Password CODE:
         * <input class="input_error form_input" placeholder="Password" type="password" data-test="password"
         *  id="password" name="password" autocorrect="off" autocapitalize="none" value="">*/
        WebElement passCode = driver.findElement(By.xpath("//input[@name='password']"));
        passCode.sendKeys("secret_sauce");

        /*Loging Button CODE:
         * <input type="submit" class="submit-button btn_action" data-test="login-button"
         *  id="login-button" name="login-button" value="Login">*/

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        loginButton.click();


        /*BackPack Code:
        * <a href="#" id="item_4_title_link">
        <div class="inventory_item_name">Sauce Labs Backpack</div></a>*/
        WebElement backPackProduct = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String product1 = backPackProduct.getText();
        backPackProduct.click();

        /*add to cart  CODE:
         * <button class="btn btn_primary btn_small btn_inventory" data-test="add-to-cart-sauce-labs-backpack"
         * id="add-to-cart-sauce-labs-backpack" name="add-to-cart-sauce-labs-backpack">Add to cart</button>*/
        WebElement add2CartBackPack = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
        add2CartBackPack.click();

        driver.navigate().back();

        /*T-shirt Code:
         * <div class="inventory_item_name">Sauce Labs Bolt T-Shirt</div>*/
        //We located the element with its text check below:
        WebElement tshirtProduct = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        String product2 = tshirtProduct.getText();
        tshirtProduct.click();

        /*Addtocart of T-shirtProduct CODE::
         * <button class="btn btn_primary btn_small btn_inventory" data-test="add-to-cart-sauce-labs-bolt-t-shirt"
         * id="add-to-cart-sauce-labs-bolt-t-shirt" name="add-to-cart-sauce-labs-bolt-t-shirt">Add to cart</button>*/
        WebElement add2CartTshirt = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        add2CartTshirt.click();

        /*Cart Icon Code:
         * <a class="shopping_cart_link"><span class="shopping_cart_badge">2</span></a>*/
        WebElement CheckoutIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        CheckoutIcon.click();

        /*CheckOut CODE:
         * <button class="btn btn_action btn_medium checkout_button"
         * data-test="checkout" id="checkout" name="checkout">Checkout</button>*/
        WebElement checkOutButton = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        checkOutButton.click();

        /*form Filling:
         * firstName CODE:
         * <input class="input_error form_input" placeholder="First Name" type="text" data-test="firstName"
         * id="first-name" name="firstName" autocorrect="off" autocapitalize="none" value="">*/
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("John");

        /*Last Name CODE:
         * <input class="input_error form_input" placeholder="Last Name" type="text" data-test="lastName"
         * id="last-name" name="lastName" autocorrect="off" autocapitalize="none" value="">*/
        WebElement LastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        LastName.sendKeys("Doe");

        /*ZipCode CODE:
         * <input class="input_error form_input" placeholder="Zip/Postal Code" type="text" data-test="postalCode"
         * id="postal-code" name="postalCode" autocorrect="off" autocapitalize="none" value="">*/
        WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zipCode.sendKeys("11101");

        /*Continue Button CODE:
         * <input type="submit" class="submit-button btn btn_primary cart_button btn_action"
         * data-test="continue" id="continue" name="continue" value="Continue">*/
        WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
        continueButton.click();

        List<WebElement> inventoryItemName = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        System.out.println(inventoryItemName.get(0).getText().equals(product1));
        System.out.println(inventoryItemName.get(1).getText().equals(product2));
    }
}
