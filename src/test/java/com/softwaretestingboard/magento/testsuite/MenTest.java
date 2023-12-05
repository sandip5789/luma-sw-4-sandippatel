package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MensPantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {

    HomePage homePage = new HomePage();
    MensPantsPage mensPantsPage = new MensPantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    // 1. userShouldAddProductSuccessFullyToShoppingCart
    @Test
    public void  userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Men Menu
        Thread.sleep(2000);
        homePage.mouseHoverOnMenMenu();
        // Mouse Hover on Bottoms
        homePage.mouseHoverOnBottom();
        // Click on Pants
        homePage.mouseHoverAndClickOnPants();
        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        mensPantsPage.mouseHoverOnProductNameCronusYogaPant();
        mensPantsPage.mouseHoverAndClickOnCronusYogaPantSize32();
        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        mensPantsPage.mouseHoverAndClickCronusYogaPantColourBlack();
        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        mensPantsPage.mouseHoverAndClickOnCronusYogaPantAddToCartButton();
        // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedProductAddMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualProductAddMessage = mensPantsPage.getProductAddedMessage().substring(0, expectedProductAddMessage.length());
        Assert.assertEquals(actualProductAddMessage, expectedProductAddMessage);
        // Click on ‘shopping cart’ Link into message
        mensPantsPage.clickOnShoppingCartLinkInProductAddMessage();
        // Verify the text ‘Shopping Cart.’
        String expectedShoppingCartWelcomeMessage = "Shopping Cart";
        String actualShoppingCartWelcomeMessage = shoppingCartPage.getWelcomeText().substring(0, expectedShoppingCartWelcomeMessage.length());
        Assert.assertEquals(actualShoppingCartWelcomeMessage, expectedShoppingCartWelcomeMessage);
        // Verify the product name ‘Cronus Yoga Pan
        String expectedProductName = "Cronus Yoga Pan";
        String actualProductName = shoppingCartPage.getProductName().substring(0, expectedProductName.length());
        Assert.assertEquals(actualProductName, expectedProductName);
        // Verify the product size ‘32’
        String expectedProductSize = "32";
        String actualProductSize = shoppingCartPage.getProductSize().substring(0, expectedProductSize.length());
        Assert.assertEquals(actualProductSize, expectedProductSize);
        // Verify the product colour ‘Black’
        String expectedProductColour = "Black";
        String actualProductColour = shoppingCartPage.getProductColour().substring(0, expectedProductColour.length());
        Assert.assertEquals(actualProductColour, expectedProductColour);

    }

}
