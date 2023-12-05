package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MensPantsPage extends Utility {

    By cronusYogaPantLink = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By cronusYogaPantSize32Selection = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By cronusYogaPantColourBlackSelection = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By cronusYogaPantAddToCartButton = By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]");
    By productAddedMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLinkInProductAddMessage = By.xpath("//a[normalize-space()='shopping cart']");


    public void mouseHoverOnProductNameCronusYogaPant() {
        mouseHoverToElement(cronusYogaPantLink);
    }

    public void mouseHoverAndClickOnCronusYogaPantSize32() {
        mouseHoverToElementAndClick(cronusYogaPantSize32Selection);
    }

    public void mouseHoverAndClickCronusYogaPantColourBlack() {
        mouseHoverToElementAndClick(cronusYogaPantColourBlackSelection);
    }

    public void mouseHoverAndClickOnCronusYogaPantAddToCartButton() {
        mouseHoverToElementAndClick(cronusYogaPantAddToCartButton);
    }

    public String getProductAddedMessage() {
        return getTextFromElement(productAddedMessage);
    }

    public void clickOnShoppingCartLinkInProductAddMessage() {
        clickOnElement(shoppingCartLinkInProductAddMessage);
    }
}
