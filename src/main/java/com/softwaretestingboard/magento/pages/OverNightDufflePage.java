package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDufflePage extends Utility {

    By welcomeText = By.xpath("//span[@class='base']");
    By quantityField = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//span[normalize-space()='Add to Cart']");
    By productAddedToCartSuccessMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLinkInSuccessMessage = By.xpath("//a[normalize-space()='shopping cart']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void sendDataToQuantityField (String quantity) {
        sendTextToElement(quantityField, quantity);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getTextFromProductAddedToCartSuccessMessage() {
        return getTextFromElement(productAddedToCartSuccessMessage);
    }

    public void clickOnShoppingCartLinkInSuccessMessage() {
        clickOnElement(shoppingCartLinkInSuccessMessage);
    }
}
