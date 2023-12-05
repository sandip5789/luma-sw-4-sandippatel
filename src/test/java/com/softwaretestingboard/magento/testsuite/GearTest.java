package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {

    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    // 1. userShouldAddProductSuccessFullyTo ShoppingCart
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Gear Menu
        Thread.sleep(2000);
        homePage.mouseHoverOnGearMenu();
        // Click on Bags
        Thread.sleep(2000);
        homePage.mouseHoverAndClickOnBagsSubMenuOfGear();
        // Click on Product Name ‘Overnight Duffle’
        bagsPage.mouseHoverAndClickOnOvernightDuffleProduct();
        // Verify the text ‘Overnight Duffle’
        String expectedMessage = "Overnight Duffle";
        String actualMessage = overNightDufflePage.getWelcomeText().substring(0, expectedMessage.length());
        Assert.assertEquals(actualMessage, expectedMessage);
        // Change Qty 3
        overNightDufflePage.sendDataToQuantityField(Keys.CONTROL + "a");
        overNightDufflePage.sendDataToQuantityField("3");
        // Click on ‘Add to Cart’ Button.
        Thread.sleep(2000);
        overNightDufflePage.clickOnAddToCartButton();
        // Verify Text ‘You added Overnight Duffle to your shopping cart.’
        String expectedShoppingCartWelcomeMessage = "You added Overnight Duffle to your shopping cart.’";
        String actualShoppingCartWelcomeMessage = shoppingCartPage.getWelcomeText().substring(0, expectedShoppingCartWelcomeMessage.length());
        Assert.assertEquals(actualShoppingCartWelcomeMessage, expectedShoppingCartWelcomeMessage);
        // Verify the Qty is ‘3’
        String expectedQuantity = "3";
        String actualQuantity = shoppingCartPage.getQuantity().substring(0, expectedQuantity.length());
        Assert.assertEquals(actualQuantity, expectedQuantity);
        // Verify the product price ‘$135.00’
        String expectedSubTotal = "$135.00";
        String actualSubTotal = shoppingCartPage.getSubTotal().substring(0, expectedSubTotal.length());
        Assert.assertEquals(actualSubTotal, expectedSubTotal);
        // Change Qty to ‘5’
        shoppingCartPage.sendDataToQuantityField(Keys.CONTROL + "a");
        shoppingCartPage.sendDataToQuantityField("5");
        // Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();
        // Verify the product price ‘$225.00’
        Thread.sleep(2000);
        String expectedSubTotal1 = "$225.00";
        String actualSubTotal1 = shoppingCartPage.getSubTotal().substring(0, expectedSubTotal1.length());
        Assert.assertEquals(actualSubTotal1, expectedSubTotal1);
    }
}
