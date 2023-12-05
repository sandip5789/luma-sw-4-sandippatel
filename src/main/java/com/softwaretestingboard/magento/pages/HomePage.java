package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {


    By womenMenuLink = By.xpath("//span[normalize-space()='Women']");
    By topsLink = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketLink = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By mensMenuLink = By.xpath("//span[normalize-space()='Men']");
    By mensBottomLink = By.xpath("//a[@id='ui-id-18']");
    By mensPantsLink = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bagsSubMenuOfGear = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenuLink);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(topsLink);

    }

    public void clickOnJacket() {
        mouseHoverToElementAndClick(jacketLink);
    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(mensMenuLink);
    }

    public void mouseHoverOnBottom() {
        mouseHoverToElement(mensBottomLink);
    }

    public void mouseHoverAndClickOnPants() {
        mouseHoverToElementAndClick(mensPantsLink);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverAndClickOnBagsSubMenuOfGear() {
        mouseHoverToElementAndClick(bagsSubMenuOfGear);
    }
}
